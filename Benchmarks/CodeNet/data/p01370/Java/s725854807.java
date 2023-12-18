import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int t = sc.nextInt();
			int n = sc.nextInt();
			if(t==0 && n==0) break;
			
			boolean[][] map = new boolean[150][150];
			boolean[][] visit = new boolean[150][150];
			int p, q, r;
			for(int i=0;i<n;i++){
				p = sc.nextInt()+75;
				q = sc.nextInt()+75;
				map[q][p] = true;
			}
			p = sc.nextInt()+75;
			q = sc.nextInt()+75;
			
			int cnt = 1;
			LinkedList<Integer> x = new LinkedList<Integer>();
			LinkedList<Integer> y = new LinkedList<Integer>();
			int[] a = new int[]{1,1,0,-1,-1,0};
			int[] b = new int[]{1,0,1,-1,0,-1};
			x.offer(p);
			y.offer(q);
			visit[q][p] = true;
			for(int i=0;i<t;i++){
				r = x.size();
				for(int j=0;j<r;j++){
					p = x.poll();
					q = y.poll();
					for(int k=0;k<6;k++){
						if(visit[q+b[k]][p+a[k]]==false && map[q+b[k]][p+a[k]]==false){
							visit[q+b[k]][p+a[k]] = true;
							x.offer(p+a[k]);
							y.offer(q+b[k]);
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}	
	}	
}