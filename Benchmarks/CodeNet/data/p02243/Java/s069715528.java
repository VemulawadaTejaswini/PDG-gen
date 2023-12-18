import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	private static FastScanner sc = new FastScanner(System.in);
	static Node[] V;
	static PriorityQueue<Node> que = new PriorityQueue<>((a, b) -> a.d - b.d);

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		V = new Node[n];
		for(int i=0; i<n; i++) {
			sc.nextInt();
			int k = sc.nextInt();
			int[] v = new int[n];
			int[] c = new int[n];
			for(int j=0; j<k; j++) {
				v[j] = sc.nextInt();
				c[j] = sc.nextInt();
			}
			V[i] = new Node(v, c, i);
		}
		V[0].d = 0;
		que.add(V[0]);
		
		while(!que.isEmpty()) {
			Node node1 = que.poll();
			for(int i=0; i<node1.v.length; i++) {
				if (node1.prev == node1.v[i]) {
                    continue;
                }
				Node node2 = V[node1.v[i]];
				if(node2.d > node1.d + node1.c[i]) {
					if(que.contains(node2)) {
						que.remove(node2);
					}
					node2.d = node1.d + node1.c[i];
					node2.prev = node1.id;
					que.add(node2);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(i + " " + V[i].d);
		}
	}
	
	static class Node {
		int d = Integer.MAX_VALUE;
		int[] v;
		int[] c;
		int prev = -1;
		int id;
		
		Node(int[] v, int[] c, int id) {
			this.v = v;
			this.c = c;
		}
	}

	private static class FastScanner {
        InputStreamReader isr;
        BufferedReader br;
        StreamTokenizer st;
         
        FastScanner (InputStream in) {
            isr = new InputStreamReader(in);
            br = new BufferedReader(isr);
            st = new StreamTokenizer(br);
        }
         
        String next() throws RuntimeException  {
            try {
                if (st.nextToken() != StreamTokenizer.TT_WORD) {
                }
            } catch (IOException e) {
                throw new IllegalStateException();
            }
             
            return st.sval;
        }
         
        int nextInt() throws RuntimeException {
            try {
                if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
                    throw new InputMismatchException();
                }
            } catch (IOException e) {
                throw new IllegalStateException();
            }
             
            return (int)st.nval;
        }
 
        void close() {
        }
    }
}