import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static final int DIM = 2;
	static Node2DTree[] V;
	static PriorityQueue<Integer> set;

	public static void main(String[] args) {
		int n = sc.nextInt();

		V = new Node2DTree[n];
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			V[i] = new Node2DTree(i, x, y);
		}

		Node2DTree[] temp = Arrays.copyOf(V, n);
		Arrays.sort(temp, (a, b) -> a.x - b.x);
		Node2DTree root = temp[(n-1)/2];
		root.addNode(temp, 0);

		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<q; i++) {
			int sx = sc.nextInt();
			int tx = sc.nextInt();
			int sy = sc.nextInt();
			int ty = sc.nextInt();

			set = new PriorityQueue<>();
			root.searchNode(sx, tx, sy, ty, 0);

			while(!set.isEmpty()) {
				sb.append(set.poll());
				sb.append("\n");
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

	static class Node2DTree {
		int id;
		int left = -1;
		int right = -1;
		int x;
		int y;

		Node2DTree(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}

		//??§?¨????????????´????????????????????????????????????
		void addNode(Node2DTree[] list, int depth) {
//			for(int i=0; i<list.length; i++) {
//				System.out.print(list[i].id + " ");
//			}
//			System.out.println();

			if(list.length == 1) {
				return;
			}

			if(depth % 2 == 0) {
				if(list.length != 2) {
					Node2DTree[] l_list = Arrays.copyOfRange(list, 0, (list.length - 1) / 2);
					Arrays.sort(l_list, (a, b) -> a.y - b.y);
					if(l_list.length != 0) {
						Node2DTree l_median = l_list[(l_list.length - 1) / 2];
						left = l_median.id;
						l_median.addNode(l_list, depth + 1);
					}
				}
				Node2DTree[] r_list = Arrays.copyOfRange(list, (list.length - 1) / 2 + 1, list.length);
				Arrays.sort(r_list, (a, b) -> a.y - b.y);
				if(r_list.length != 0) {
					Node2DTree r_median = r_list[(r_list.length - 1) / 2];
					right = r_median.id;
					r_median.addNode(r_list, depth + 1);
				}

			} else {
				if(list.length != 2) {
					Node2DTree[] l_list = Arrays.copyOfRange(list, 0, (list.length - 1) / 2);
					Arrays.sort(l_list, (a, b) -> a.x - b.x);
					if(l_list.length != 0) {
						Node2DTree l_median = l_list[(l_list.length - 1) / 2];
						left = l_median.id;
						l_median.addNode(l_list, depth + 1);
					}
				}
				Node2DTree[] r_list = Arrays.copyOfRange(list, (list.length - 1) / 2 + 1, list.length);
				Arrays.sort(r_list, (a, b) -> a.x - b.x);
				if(r_list.length != 0) {
					Node2DTree r_median = r_list[(r_list.length - 1) / 2];
					right = r_median.id;
					r_median.addNode(r_list, depth + 1);
				}
			}
		}

		void searchNode(int sx, int tx, int sy, int ty, int depth) {
//			System.out.println(id);
			if(depth % 2 == 0) {
				if(tx < x) {
					if(left != -1) {
						V[left].searchNode(sx, tx, sy, ty, depth + 1);
					}
				} else if(sx > x){
					if(right != -1) {
						V[right].searchNode(sx, tx, sy, ty, depth + 1);
					}
				} else {
					if(left != -1) {
						V[left].searchNode(sx, tx, sy, ty, depth + 1);
					}
					if(right != -1) {
						V[right].searchNode(sx, tx, sy, ty, depth + 1);
					}
					if(sy <= y && y <= ty) {
						set.add(id);
					}
				}
			} else {
				if(ty < y) {
					if(left != -1) {
						V[left].searchNode(sx, tx, sy, ty, depth + 1);
					}
				} else if(sy > y){
					if(right != -1) {
						V[right].searchNode(sx, tx, sy, ty, depth + 1);
					}
				} else {
					if(left != -1) {
						V[left].searchNode(sx, tx, sy, ty, depth + 1);
					}
					if(right != -1) {
						V[right].searchNode(sx, tx, sy, ty, depth + 1);
					}
					if(sx <= x && x <= tx) {
						set.add(id);
					}
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