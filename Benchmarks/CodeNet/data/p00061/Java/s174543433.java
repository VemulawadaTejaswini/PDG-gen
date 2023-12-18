import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		int[] rank = new int[31];
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			String str;
			while( !(str = stdIn.next()).equals("0,0") ){
				String[] s = str.split(",");
				int[] a = new int[2];
				a[0] = Integer.parseInt(s[0]); a[1] = Integer.parseInt(s[1]);				
				data.put(a[0], a[1]);
				if( rank[a[1]] != 1 ){
					rank[a[1]] = 1;
				}
			}
			int r = 0;
			for(int i = 30; i >= 0; i--){
				if( rank[i] == 1 ){
					rank[i] += r;
					r++;
				}
			}
		
			while( stdIn.hasNext() ){
				int n = stdIn.nextInt();
				result.add(rank[data.get(n)]);
			}
			for(Integer num : result){
				System.out.println(num);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}

	