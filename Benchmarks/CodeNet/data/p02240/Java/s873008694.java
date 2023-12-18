import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static class ConnectedComponents {
		public void CC (InputReader ir) {
			
			int n = ir.nextInt();
			int m = ir.nextInt();
			SNS[] sns = new SNS[n];
			
			for (int i = 0; i < n; i++) {
				sns[i] = new SNS ();
			}
			
			for (int i = 0; i < m; i++) {
				int id = ir.nextInt();
				int t = ir.nextInt();
				sns[id].friend.add(t);
				sns[t].friend.add(id);
				
			}
			
			int q = ir.nextInt();
			
			for (int i = 0; i < q; i++) {
				int s = ir.nextInt();
				int t = ir.nextInt();
				if (cc (sns, s, t)) System.out.println("yes");
				else System.out.println("no");
				for (int j = 0; j < n; j++) {
					sns[j].dis = null;
				}
				
			}
			
		}
		
		public boolean cc (SNS[] sns, int s, int t) {
			
			if ( s == t) return true;

			if (sns[s].dis == null) {
				sns[s].dis = 0;
				if (sns[s].friend != null) {
					for (int i = 0; i < sns[s].friend.size(); i++) {
						if (cc (sns, sns[s].friend.get(i), t)) return true;
					}
				}
			}
			
			
			return false;
			
		}
		
	}
	
	static class SNS {
		List<Integer> friend = new ArrayList<> ();
		Integer dis;
		SNS (){
			dis = null;
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
		ConnectedComponents obj = new ConnectedComponents ();
		obj.CC (in);
	}
	
	
}

