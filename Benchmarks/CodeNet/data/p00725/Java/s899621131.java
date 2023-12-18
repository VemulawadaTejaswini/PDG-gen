import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			LinkedList<Integer> x = new LinkedList<Integer>();
			LinkedList<Integer> y = new LinkedList<Integer>();
			LinkedList<int[][]> m = new LinkedList<int[][]>();
			int[][] map = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j]==2){
						x.offer(j);
						y.offer(i);
						map[i][j] = 0;
						m.offer(map);
					}
				}
			}
			
			int z, p, q;
			int[][] r = new int[h][w];
			int cnt = 0;
			boolean flag = false;
			while(true){
				cnt++;
				z = m.size();
				for(int i=0;i<z;i++){
					p = x.poll();
					q = y.poll();
					r = m.poll();					
					
					for(int j=p-1;j>=0;j--){
						if(r[q][j]==3){
							flag = true;
							break;
						}else if(r[q][j]==1){
							if(j==p-1) break;
							else{
								r[q][j] = 0;
								x.offer(j+1);
								y.offer(q);
								m.offer(r);		
								break;
							}
						}
					}
					
					for(int j=p+1;j<w;j++){
						if(r[q][j]==3){
							flag = true;
							break;
						}else if(r[q][j]==1){
							if(j==p+1) break;
							else{
								r[q][j] = 0;
								x.offer(j-1);
								y.offer(q);
								m.offer(r);
								break;
							}
						}
					}
					
					for(int j=q-1;j>=0;j--){
						if(r[j][p]==3){
							flag = true;
							break;
						}else if(r[j][p]==1){
							if(j==q-1) break;
							else{
								r[j][p] = 0;
								x.offer(p);
								y.offer(j+1);
								m.offer(r);
								break;
							}
						}
					}
					
					for(int j=q+1;j<h;j++){
						if(r[j][p]==3){
							flag = true;
							break;
						}else if(r[j][p]==1){
							if(j==q+1) break;
							else{
								r[j][p] = 0;
								x.offer(p);
								y.offer(j-1);
								m.offer(r);
								break;
							}
						}
					}
				}
				if(flag==true){
					if(cnt>10) System.out.println(-1);
					else System.out.println(cnt);
					break;
				}else if(m.size()==0){
					System.out.println(-1);
					break;
				}
			}

		}	
	}	
}