import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static int idx_preodr = 1;

	public static void main(String[] args) {
		int n = sc.nextInt();

		Node_BT[] nodes = new Node_BT[n];
		for(int i=0; i<n; i++) {
			nodes[i] = new Node_BT();
			nodes[i].id = i;
		}

		int[] preodr = new int[n];
		for(int i=0; i<n; i++) {
			preodr[i] = sc.nextInt() - 1;
		}

		int[] inodr = new int[n];
		for(int i=0; i<n; i++) {
			inodr[i] = sc.nextInt() - 1;
		}

		nodes[preodr[0]].reconstructTree(nodes, preodr, inodr, -1);

		nodes[preodr[0]].postOrder(nodes, preodr);
		System.out.println();

	}

	static class Node_BT {
		int id;
		int left = -1;
		int right = -1;
		int parent = -1;
		HashSet<Integer> l_subtree = new HashSet<>();
		HashSet<Integer> r_subtree = new HashSet<>();

		void reconstructTree(Node_BT[] nodes, int[] preodr, int[] inodr, int parent) {
			this.parent = parent;
			leftSubTree(nodes, inodr);
			rightSubTree(nodes, inodr);

			if(idx_preodr >= preodr.length) {
				return;
			}

			if(l_subtree.contains(preodr[idx_preodr])) {
				left = preodr[idx_preodr];
				idx_preodr++;
				nodes[left].reconstructTree(nodes, preodr, inodr, id);
			}

			if(idx_preodr >= preodr.length) {
				return;
			}

			if(r_subtree.contains(preodr[idx_preodr])) {
				right = preodr[idx_preodr];
				idx_preodr++;
				nodes[right].reconstructTree(nodes, preodr, inodr, id);
			}
		}

		void leftSubTree(Node_BT[] nodes, int[] inodr) {
			int i = 0;
			while(inodr[i] != id) {
				i++;
			}

			i--;
			if(parent == -1) {
				while(i >= 0) {
					l_subtree.add(inodr[i]);
					i--;
				}
			} else {
				if(nodes[parent].l_subtree.contains(id)) {
					while(i >= 0 && nodes[parent].l_subtree.contains(inodr[i])) {
						l_subtree.add(inodr[i]);
						i--;
					}
				} else {
					while(i >= 0 && nodes[parent].r_subtree.contains(inodr[i])) {
						l_subtree.add(inodr[i]);
						i--;
					}
				}
			}
		}

		void rightSubTree(Node_BT[] nodes, int[] inodr) {
			int i = 0;
			while(inodr[i] != id) {
				i++;
			}

			i++;
			if(parent == -1) {
				while(i < inodr.length) {
					r_subtree.add(inodr[i]);
					i++;
				}
			} else {
				if(nodes[parent].l_subtree.contains(id)) {
					while(i < inodr.length && nodes[parent].l_subtree.contains(inodr[i])) {
						r_subtree.add(inodr[i]);
						i++;
					}
				} else {
					while(i < inodr.length && nodes[parent].r_subtree.contains(inodr[i])) {
						r_subtree.add(inodr[i]);
						i++;
					}
				}
			}
		}

		void postOrder(Node_BT[] nodes, int[] preodr) {
			if(left != -1) {
				nodes[left].postOrder(nodes, preodr);
			}
			if(right != -1) {
				nodes[right].postOrder(nodes, preodr);
			}
			System.out.print(id + 1);
			if(id != preodr[0]) {
				System.out.print(" ");
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