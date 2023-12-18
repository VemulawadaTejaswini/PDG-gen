import java.util.Scanner;

public class Main {
	/**
	 * TODO : ただの再帰ではなく、バランスを取らなければならない
	 *　これは手戻りが発生する 
	 * 
	 * @author Taichiro
	 *
	 */
	public static class Node{
		Node left, right;
		int l_dist, r_dist;
		int weight;
		
		public Node(int l_dist, int r_dist) {
			super();
			this.l_dist = l_dist;
			this.r_dist = r_dist;
			this.weight = 0;
		}
		
		public int solve(){
			if(this.weight != 0){
				return this.weight;
			}
			
			if(this.left == null && this.right == null){
				final int moment  = lcm(this.l_dist, this.r_dist);
				final int left_w  = moment / l_dist;
				final int right_w = moment / r_dist;
				
				return this.weight = (left_w + right_w);
			}else{
				final int left_ch_w  = left  != null ? left.solve()  : 1;
				final int right_ch_w = right != null ? right.solve() : 1;
				
				final int moment = lcm(left_ch_w * l_dist, right_ch_w * r_dist);
				
				final int left_w  = moment / l_dist;
				final int right_w = moment / r_dist;
				
				return this.weight = (left_w + right_w);
			}
		}
		
		public String toString(){
			return "[" + this.weight + " : " + (this.left == null ? "" : this.left.toString()) + ", " + (this.right == null ? "" : this.right.toString()) + "]";
		}
	}
	
	public static int gcd(int x, int y){
		if(x == 0){
			return y;
		}else{
			return gcd(y % x, x);
		}
	}
	
	public static int lcm(int x, int y){
		return  x * y / gcd(x, y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[][] data = new int[n][4];
			Node[] nodes = new Node[n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 4; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			for(int i = n - 1; i >= 0; i--){
				//System.out.println(i);
				nodes[i] = new Node(data[i][0], data[i][1]);
			}
			for(int i = n - 1; i >= 0; i--){
				if(data[i][2] != 0){
					nodes[i].left  = nodes[data[i][2] - 1];
				}
				if(data[i][3] != 0){
					nodes[i].right = nodes[data[i][3] - 1];
				}
			}
			
			int max = 0;
			for(int i = 0; i < n; i++){
				max = Math.max(max, nodes[i].solve());
			}
			
			System.out.println(max);
		}
	}

}