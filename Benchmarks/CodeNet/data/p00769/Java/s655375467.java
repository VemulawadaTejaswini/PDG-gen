import java.util.*;
import java.awt.geom.*;

public class Main{
	String s;
	int pos;
	int INF = 1 << 29;
	
	public void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			s = sc.next() + "#";
			pos = 0;
			int res = dfs();
			System.out.println(res);
		}
	}

	private int dfs(){
		if(Character.isDigit(s.charAt(pos))){
			int num = s.charAt(pos++) - '0';
			while(Character.isDigit(s.charAt(pos))){
				num = num * 10 + s.charAt(pos++) - '0';
			}
			return num / 2 + 1;
		}
		else{
			int min = INF;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(s.charAt(pos) == '['){
				pos++;
				int res = dfs();
				pos++;
				list.add(res);
			}
			if(list.size() == 0){
				return min;
			}
			else{
				Collections.sort(list);
				int sum = 0;
				for(int i = 0; i < list.size() / 2 + 1;i++){
					sum += list.get(i);
				}
				return sum;
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}