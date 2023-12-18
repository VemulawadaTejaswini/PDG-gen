import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static StringBuilder ans = new StringBuilder();

	public static void main(String[] args) {
		int n = sc.nextInt();

		Node_BT[] nodes = new Node_BT[n];
		for(int i=0; i<n; i++) {
			nodes[i] = new Node_BT();
		}

		for(int i=0; i<n; i++) {
			String cmd = sc.next();

			if(cmd.equals("insert")) {
				int key = sc.nextInt();
				nodes[i].id = i;
				nodes[i].key = key;

				if(i != 0) {
					int x = 0;

					while(nodes[x].left != -1 || nodes[x].right != -1) {

						if(nodes[i].key < nodes[x].key) {
							if(nodes[x].left == -1) {
								break;
							}
							x = nodes[x].left;
						} else {
							if(nodes[x].right == -1) {
								break;
							}
							x = nodes[x].right;
						}
					}

					nodes[i].parent = x;

					if(nodes[i].key < nodes[x].key) {
						nodes[x].left = i;
					} else {
						nodes[x].right = i;
					}
				}

			} else {
				nodes[0].inOrder(nodes);
				ans.append("\n");
				nodes[0].preOrder(nodes);
				System.out.println(ans);

			}
		}
	}

	static class Node_BT {
		int id;
		int left = -1;
		int right = -1;
		int parent = -1;
		int key;

		void preOrder(Node_BT[] nodes) {
			ans.append(" ");
			ans.append(key);
			if(left != -1) {
				nodes[left].preOrder(nodes);
			}
			if(right != -1) {
				nodes[right].preOrder(nodes);
			}
		}

		void inOrder(Node_BT[] nodes) {
			if(left != -1) {
				nodes[left].inOrder(nodes);
			}
			ans.append(" ");
			ans.append(key);
			if(right != -1) {
				nodes[right].inOrder(nodes);
			}
		}

//		void postOrder(Node_BT[] nodes) {
//			if(left != -1) {
//				nodes[left].postOrder(nodes);
//			}
//			if(right != -1) {
//				nodes[right].postOrder(nodes);
//			}
//			System.out.print(" " + id);
//		}
	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}