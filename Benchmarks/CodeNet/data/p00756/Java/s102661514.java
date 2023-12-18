import java.util.*;

public class Main {
	final int MAX = Integer.MAX_VALUE;
	Scanner sc = new Scanner(System.in);
	void doIt() {
		new And_Then_How_Many_Are_There().main();
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
	class And_Then_How_Many_Are_There{
		Set<Integer> status;
		Node v[];
		void main() {
			while(true) {
				int n = sc.nextInt();
				if(n == 0) return;
				status = new HashSet<>();
				v = new Node[n];
				for(int i = 0; i < n; i++) {
					v[i] = new Node(i, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				}
				for(int i = 0; i < n; i++) {
					for(int j = i + 1; j < n; j++) {
						v[i].over(v[j]);
					}
				}
				List<Node> use = new ArrayList<>();
				for(int i = 0; i < n; i++) {
					if(v[i].dps == 0) use.add(v[i]);
				}
				//Nodeの親子を出力
				/*
				for(int i = 0; i < n; i++) {
					Node node = v[i];
					System.out.println(node.idx +" :: " + node.dps);
						System.out.println(node.idx +  ":"  + node.dps  +  " -> " + node.parentToString());
						System.out.println(node.idx +  ":"  + node.dps  +  " <- " + node.childrenToString());
				}
				 */

				search(use, 0);
				int max = 0;
				int maxint = 0;
				for(int i : status) {
					max = Math.max(Integer.bitCount(i), max);
					//System.out.println(Integer.toBinaryString(i));
				}
				System.out.println(max);

			}


		}
		void search(List<Node> use, int sta) {
			//useの状態、bitを出力
			/*System.out.print("[");
			for(Node n : use) System.out.print(n.idx + ", ");
			System.out.println("]");
			System.out.println(Integer.toBinaryString(has) +" : "+ Integer.bitCount(has));
			 */
			if(status.contains(sta))return;
			status.add(sta);
			//System.out.println(Integer.toBinaryString(has));
			for(Node i : use) {
				if((sta >> i.idx & 1) == 1) continue;
				for(Node j : use) {
					if((sta >> j.idx & 1) == 1) continue;
					if(i.equals(j)) continue;
					if(i.color == j.color && !status.contains(sta + (1 << i.idx) + (1 << j.idx))) {
						List<Node> next = new ArrayList<>(use);
						next.remove(i); 
						next.remove(j);
						//for(Node node : next) System.out.print(node.idx + " ");
						//System.out.println();
						for(Node k : i.children) {
							//System.out.println(i);
							k.parent.remove(i);
							//System.out.println(k + " " + k.parent.isEmpty() +  ": " + k.parentToString());
							if(k.parent.isEmpty()) {
								next.add(k);
							}
						}
						for(Node k : j.children) {
							k.parent.remove(j);
							if(k.parent.size() == 0) {
								next.add(k);
							}
						}
						//System.out.println(Integer.toBinaryString(has) + "->");
						int _has = sta;
						_has += (1 << i.idx);
						_has += (1 << j.idx);
						//System.out.println(Integer.toBinaryString(_has));
						//System.out.println();
						//System.out.println(ans + " " + search(ans + 2, next, _has));
						search(next, _has);
						for(Node k : i.children) {
							k.parent.add(i);
						}
						for(Node k : j.children) {
							k.parent.add(j);
						}
					}
				}
			}


		}

		class Node{
			List<Node> parent;
			List<Node> children = new ArrayList<>();
			int idx, color, dps;
			int x, y, r;
			Node(int i, int x, int y, int r, int c){
				idx = i;
				this.x = x; this.y = y; this.r = r;
				color = c;
				dps = 0;
				parent = new ArrayList<>();
			}
			void over(Node v) {
				if(isOver(this.x, this.y, this.r, v.x, v.y, v.r)) {
					if(this.idx < v.idx) {
						//System.out.println(v.idx + "=>" + this.idx);
						if(v.dps <= this.dps) {
							v.dps = this.dps + 1;
						}
						v.parent.add(this);
						this.children.add(v);

					}
					else {
						//System.out.println(this.idx + "=>" + v.idx);
						if(v.dps >= this.dps) {

							this.dps = v.dps + 1;
						}
						this.parent.add(v);
						v.children.add(v);
					}
				}
				//else System.out.println(this.idx + "<>" + v.idx);

			}
			String parentToString() {
				String s = "";
				for(Node i : parent) {
					s += i.idx + " ";
				}
				return s;
			}
			String childrenToString() {
				String s = "";
				for(Node i : children) {
					s += i.idx + " ";
				}
				return s;
			}
			boolean isOver(int x, int y, int r, int x2, int y2, int r2) {
				if(r + r2 > Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2))){
					return true;
				}
				else return false;
			}
		}
	}
}
