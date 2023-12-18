import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class Priorityqueue {
		public void priorityqueue (InputReader ir) {
			
			Queue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());;
			StringBuilder sb = new StringBuilder ();
			
			while (true) {
				
				String ord = ir.nextString();
				
				if (ord.equals("end")) break;
				
				if (ord.equals("insert")) pq.add(ir.nextInt());
				else if (ord.equals("extract")) sb.append(pq.poll()).append("\n"); 
				
			}
			
			System.out.print(sb);
			
		}
	}

	static class InputReader {
		BufferedReader br;
		StringTokenizer st;
		
		public String nextString() {
			
			 while (!st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			br = new BufferedReader (new InputStreamReader (inputStream));
			st = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		Priorityqueue obj = new Priorityqueue ();
		obj.priorityqueue (in);
	}
	
	
}

