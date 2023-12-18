import java.util.*;

public class Main{
	public static String solve(char[][] map){
		Set<List<Integer>> record = new HashSet<List<Integer>>();
		List<Integer> now = new ArrayList<Integer>();
		now.add(0); now.add(0);
		record.add(now);
		while( map[now.get(0)][now.get(1)] != '.' ){
			int a = now.get(0); int b = now.get(1);
			if( map[a][b] == '>' ){
				++b;
			} else if( map[a][b] == '<' ){
				--b;
			} else if( map[a][b] == '^' ){
				--a;					
			} else if( map[a][b] == 'v' ){
				++a;				
			}
			now.clear();
			now.add(a); now.add(b);
			if( record.contains(now) ){
				return "LOOP";
			}
			record.add(now);			
		}
		return now.get(1) + " " + now.get(0);
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		
		String str;
		while( !(str = stdIn.nextLine()).equals("0 0") ){
			int H, W;
			String[] s = str.split(" ");
			H = Integer.parseInt(s[0]); W = Integer.parseInt(s[1]);
			char[][] map = new char[H][W];
			for(int i = 0; i < H; i++){
				String data = stdIn.next();
				map[i] = data.toCharArray();
			}
			result.add(solve(map));
			stdIn.nextLine();				
		}
		
		for(String ans : result){
			System.out.println(ans);
		}
	}
}