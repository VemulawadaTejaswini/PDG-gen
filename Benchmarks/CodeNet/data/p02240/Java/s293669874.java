import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class ConnectedComponents {
		public void CC (InputReader ir) {
			
			int n = ir.nextInt();
	        int m = ir.nextInt();
	        @SuppressWarnings("unchecked")
			ArrayList<Integer>[] friend = new ArrayList[n];
	        
	        for (int i = 0; i < n; i++) {
	            friend[i] = new ArrayList<Integer>();
	        }
	 
	        for (int i = 0; i < m; i++) {
	            int s = ir.nextInt();
	            int t = ir.nextInt();
	            friend[s].add(t);
	            friend[t].add(s);
	        }
	 

	        int[] ccNum = makeCCNum(friend, n);
	         
	        int q = ir.nextInt();
	        for (int i = 0; i < q; i++) {
	            int s = ir.nextInt();
	            int t = ir.nextInt();
	            System.out.println(ccNum[s] == ccNum[t] ? "yes" : "no");
	        }
			
		}

		 static int[] makeCCNum(ArrayList<Integer>[] friend, int n) {
		        int[] ccNum = new int[n];
		        int num = 1;
		        boolean[] flg = new boolean[n]; // visited?
		        for (int i = 0; i < n; i++) {
		            if (flg[i])
		                continue;
		 
		            // 未到達の点から連結成分を作成
		            Queue<Integer> q = new LinkedList<Integer>();
		            q.add(i);
		             
		            while (!q.isEmpty()) {
		                int top = q.poll();
		                flg[top] = true;
		                ccNum[top] = num;
		 
		                for (int adj : friend[top]) {
		                    if (!flg[adj]) {
		                        flg[adj] = true;
		                        q.add(adj);
		                        ccNum[adj] = num;
		                    }
		                }
		            }
		 
		            // 次の連結成分には別の番号をつける
		            num++;
		        }
		        return ccNum;
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

