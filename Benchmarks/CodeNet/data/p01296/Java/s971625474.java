import java.util.*;

public class Main{
	int n;
	int [][] data;
	HashSet<P> legs, heads;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	class P {
		int x,y;

		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			P other = (P) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		private Main getOuterType() {
			return Main.this;
		}

		@Override
		public String toString() {
			return "P [x=" + x + ", y=" + y + "]";
		}
		
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			data = new int[n][3];
			for(int i = 0; i < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int dir = sc.next().charAt(0) == 'x' ? 0: 1;
				data[i][0] = x;
				data[i][1] = y;
				data[i][2] = dir;
			}
			legs = new HashSet<P>();
			heads = new HashSet<P>();
			boolean res = dfs(0);
			System.out.println(res ? "Yes" : "No");
		}
	}

	private boolean dfs(int deep) {
		if(deep == n){
			return true;
		}
		int x = data[deep][0];
		int y = data[deep][1];
		P [] ps = new P[2];
		ps[0] = new P(x, y);
		if(data[deep][2] == 0){
			ps[1] = new P(ps[0].x + 1, ps[0].y);
		}
		else {
			ps[1] = new P(ps[0].x, ps[0].y + 1);
		}
		for(int i = 0; i < 2; i++){
			boolean flg = true;
			for(int j = 0; j < 4; j++){
				int xx = ps[i].x + vx[j];
				int yy = ps[i].y + vy[j];
				P pp = new P(xx, yy);
				if(heads.contains(pp)){
					flg = false;
					break;
				}
			}
			for(int j = 0; j < 4; j++){
				int xx = ps[i ^ 1].x + vx[j];
				int yy = ps[i ^ 1].y + vy[j];
				P pp = new P(xx, yy);
				if(legs.contains(pp)){
					flg = false;
					break;
				}
			}
			if(flg){
				legs.add(ps[i]);
				heads.add(ps[i^1]);
				boolean res = dfs(deep + 1);
				legs.remove(ps[i]);
				heads.remove(ps[i ^ 1]);
				if(res) return true;
			}
		}
		
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}