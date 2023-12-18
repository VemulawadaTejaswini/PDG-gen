import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int h, w;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		int s = sc.nextInt(); //s=k
		int x1 = sc.nextInt()-1;
		int y1 = sc.nextInt()-1;
		int x2 = sc.nextInt()-1;
		int y2 = sc.nextInt()-1;
		char[][] grid = new char[h][w];
		for(int i=0;i<h;i++) {
			String t = sc.next();
			for(int j=0;j<w;j++) {
				grid[i][j] = t.charAt(j);
			}
		}
		int [][][] dp = new int[h][w][4];		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				for(int k=0;k<4;k++) {
					dp[i][j][k] = 10000000;
				}
			}
		}
		PriorityQueue<Node> pq= new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return dp[o1.i][o1.j][o1.dir]-dp[o2.i][o2.j][o2.dir];
			}
			
		});
		for(int k=0;k<4;k++) {
			dp[x2][y2][k] = 0;
			pq.add(new Node(x2,y2,k,0));
		}
		int [] changeI = {-1,1,0,0};
		int [] changeJ = {0,0,1,-1};
		while(!pq.isEmpty()) {
			Node temp = pq.poll();
			int i = temp.i;
			int j = temp.j;
			int d = temp.dir;
			int steps = temp.numSteps;
			int nextI = i+changeI[d];
			int nextJ = j+changeJ[d];
			if(inBounds(nextI,nextJ) && grid[nextI][nextJ]=='.') {
				for(int a=0;a<4;a++) {
					
					if(a!=d) {
						if(dp[i-steps*changeI[d]][j-steps*changeJ[d]][d]+(int) Math.ceil((steps+1)*1.0/s) < dp[nextI][nextJ][a]) {
							dp[nextI][nextJ][a] = dp[i-steps*changeI[d]][j-steps*changeJ[d]][d]+(int) Math.ceil((steps+1)*1.0/s);
							pq.add(new Node(nextI,nextJ,a,0));
						}
					}
					else {
						if(dp[i-steps*changeI[d]][j-steps*changeJ[d]][d]+(int) Math.ceil((steps+1)*1.0/s) < dp[nextI][nextJ][a]) {
							dp[nextI][nextJ][a] = dp[i-steps*changeI[d]][j-steps*changeJ[d]][d]+(int) Math.ceil((steps+1)*1.0/s);
							pq.add(new Node(nextI,nextJ,a,steps+1));
						}
					}
					
				}
			}
			
			
		}
		int min = 10000000;
		
				for(int k=0;k<4;k++) {
					min = Math.min(min,dp[x1][y1][k]);
				}
		
		if(min==10000000) {
			System.out.println(-1);
		}
		else
		System.out.println(min);
	}
	static class Node {
		int i;
		int j;
		int dir;
		int numSteps; //do i need this?
		public Node(int i,int j,int dir, int numSteps) {
			this.i = i;
			this.j = j;
			this.dir = dir;
			this.numSteps = numSteps;
			
		}
	}
	static boolean inBounds(int x,int y) {
		return x>=0 && x<h && y>=0 && y<w;
	}
}
