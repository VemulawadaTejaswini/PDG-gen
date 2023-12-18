import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	
	static class Queue {
		public void queue (InputReader ir) {
			
			// プロセス数
			int n = ir.nextInt();
			
			// クオンタム
			int q = ir.nextInt();
			
			// プロセス情報
			Deque<String> process = new ArrayDeque<String>();
			Deque<Integer> quantum = new ArrayDeque<Integer>();
			for (int i = 0; i < n; i++) {
				process.add(ir.nextString());
				quantum.add(ir.nextInt());
			}
			
			int time = 0;
			StringBuilder sb = new StringBuilder();
			
			while (!quantum.isEmpty()) {
				String posname = process.poll();
				int postime = quantum.poll();
				
				if ( postime <= q) {
					time += postime;
					sb.append(posname).append(" ").append(Integer.toString(time)).append("\n");
				} else {
					postime -= q;
					time += q;
					process.add(posname);
					quantum.add(postime);
				}
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
		InputReader ir = new InputReader (inputStream);
		Queue obj = new Queue();
		obj.queue(ir);
	}
}

