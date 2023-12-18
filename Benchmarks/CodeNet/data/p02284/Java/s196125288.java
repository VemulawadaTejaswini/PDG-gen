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

			} else if(cmd.equals("print")) {
				nodes[0].inOrder(nodes);
				ans.append("\n");
				nodes[0].preOrder(nodes);
				ans.append("\n");

			} else {
				int key = sc.nextInt();
				if(nodes[0].findKey(nodes, key)) {
					ans.append("yes\n");
				} else {
					ans.append("no\n");
				}
			}
		}

		System.out.print(ans);
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

		boolean findKey(Node_BT[] nodes, int key) {
			if(this.key == key) {
				return true;
			} else if(key < this.key) {
				if(left == -1) {
					return false;
				} else {
					return nodes[left].findKey(nodes, key);
				}
			} else {
				if(right == -1) {
					return false;
				} else {
					return nodes[right].findKey(nodes, key);
				}
			}
		}
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