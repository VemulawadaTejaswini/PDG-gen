import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static final int DIM = 2;
	static Node2DTree[] V;
	static PriorityQueue<Integer> set;

	public static void main(String[] args) {
		int n = sc.nextInt();

		//?????????????????????????????????????????¨TLE????????????
		V = new Node2DTree[n];
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			V[i] = new Node2DTree(i, x, y);
			V[0].addNode(i, 0);
		}

		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<q; i++) {
			int sx = sc.nextInt();
			int tx = sc.nextInt();
			int sy = sc.nextInt();
			int ty = sc.nextInt();

			set = new PriorityQueue<>();
			V[0].searchNode(sx, tx, sy, ty, 0);

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
		int parent = -1;
		int x;
		int y;

		Node2DTree(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}

		//??§?¨????????????´????????????????????????????????????
		void addNode(int id_target, int depth) {
			if(id_target == 0) {
				return;
			}
			if(depth % 2 == 0) {
				if(V[id_target].x <= x) {
					if(left != -1) {
						V[left].addNode(id_target, depth + 1);
					} else {
						left = id_target;
						V[id_target].parent = id_target;
					}
				} else {
					if(right != -1) {
						V[right].addNode(id_target, depth + 1);
					} else {
						right = id_target;
						V[id_target].parent = id_target;
					}
				}
			} else {
				if(V[id_target].y <= y) {
					if(left != -1) {
						V[left].addNode(id_target, depth + 1);
					} else {
						left = id_target;
						V[id_target].parent = id_target;
					}
				} else {
					if(right != -1) {
						V[right].addNode(id_target, depth + 1);
					} else {
						right = id_target;
						V[id_target].parent = id_target;
					}
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