import java.io.*;
import java.util.*;
public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
		HashSet<Integer> stuff = new HashSet<Integer>();
		
		for(int i = 1; i<=N; i++) {
			int n = Integer.parseInt(st.nextToken());
			stuff.add(n);
			if(set.containsKey(n)) {
				set.put(n, set.get(n)+1);
			}
			else {
				set.put(n, 1);
			}
		}
		int count = 0;
		for(int n : stuff) {
			if(set.get(n) < n) count += set.get(n);
			else if(set.get(n) > n) count += set.get(n) - n;
		}
		
		System.out.println(count);
		
	}

}
