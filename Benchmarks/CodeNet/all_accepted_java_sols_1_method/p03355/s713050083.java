import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int k = Integer.parseInt(br.readLine());

		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		int n = input.length();
		
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < n; i++){
			for(int j = 1; j <= k && i + j <= n; j++){
				String sub = input.substring(i, i + j);
				
				if(!set.contains(sub)){
					set.add(sub);
					pq.add(sub);
//					System.out.println("add "+sub);
				}
			}
		}
		
		for(int i = 0; i < k - 1; i++){
//			System.out.println("poll " +pq.poll());
			pq.poll();
		}
		
		System.out.println(pq.poll());
	}

}
