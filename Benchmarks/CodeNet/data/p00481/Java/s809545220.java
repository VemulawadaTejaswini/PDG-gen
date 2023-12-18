import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		char[][] map = new char[h][w];
		int[][] cost = new int[h][w];
		for(int i=0;i<h;i++){
			map[i] = sc.next().toCharArray();
			Arrays.fill(cost[i], Integer.MAX_VALUE);
		}
		
		ArrayDeque<Integer> x = new ArrayDeque<Integer>();
		ArrayDeque<Integer> y = new ArrayDeque<Integer>();
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]=='S'){
					x.offer(j);
					y.offer(i);
					cost[i][j] = 0;
					i = h;
					j = w;
				}
			}
		}
		
		int p, q;
		int sum = 0;
		int cnt = 1;
		int[] a = new int[]{0,0,-1,1};
		int[] b = new int[]{-1,1,0,0};
		while(true){
			p = x.poll();
			q = y.poll();
			if(map[q][p]==(char)(cnt+48)){
				sum += cost[q][p];
				if(cnt==n) break;
				else{
					cnt++;
					for(int i=0;i<h;i++){
						for(int j=0;j<w;j++){
							cost[i][j] = Integer.MAX_VALUE;
						}
					}
					cost[q][p] = 0;
					x.clear();
					y.clear();
				}
			}
			
			for(int i=0;i<4;i++){
				if((i==0 && p!=0) || (i==1 && p!=w-1) || (i==2 && q!=0) || (i==3 && q!=h-1)){
					if(map[q+a[i]][p+b[i]]!='X' && cost[q][p]+1<cost[q+a[i]][p+b[i]]){
						x.offer(p+b[i]);
						y.offer(q+a[i]);
						cost[q+a[i]][p+b[i]] = cost[q][p]+1;
					}
				}
			}
		}
		System.out.println(sum);
	}	
}