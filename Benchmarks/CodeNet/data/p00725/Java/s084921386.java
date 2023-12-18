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
			LinkedList<Integer> mx = new LinkedList<Integer>();
			LinkedList<Integer> my = new LinkedList<Integer>();
			int[][] map = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j]==2){
						x.offer(j);
						y.offer(i);
						map[i][j] = 0;
					}
				}
			}
			
			int z, p, q;
			int[][] r = new int[h][w];
			int[] cx = new int[11];
			int[] cy = new int[11];
			int cnt = 0;
			boolean flag = false;
			while(true){
				z = x.size();
				for(int i=0;i<z;i++){
					p = x.poll();
					q = y.poll();
					for(int j=0;j<h;j++){
						for(int k=0;k<w;k++){
							r[j][k] = map[j][k];
						}
					}
					for(int j=0;j<cnt;j++){
						cx[i] = mx.poll();
						cy[i] = my.poll();
						r[cy[i]][cx[i]] = 0;
					}
					
					for(int j=p-1;j>=0;j--){
						if(r[q][j]==3){
							flag = true;
							break;
						}else if(r[q][j]==1){
							if(j==p-1) break;
							else{
								x.offer(j+1);
								y.offer(q);
								for(int k=0;k<cnt;k++){
									mx.offer(cx[k]);
									my.offer(cy[k]);
								}
								mx.offer(j);
								my.offer(q);								
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
								x.offer(j-1);
								y.offer(q);
								for(int k=0;k<cnt;k++){
									mx.offer(cx[k]);
									my.offer(cy[k]);
								}
								mx.offer(j);
								my.offer(q);								
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
								x.offer(p);
								y.offer(j+1);
								for(int k=0;k<cnt;k++){
									mx.offer(cx[k]);
									my.offer(cy[k]);
								}
								mx.offer(p);
								my.offer(j);
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
								x.offer(p);
								y.offer(j-1);
								for(int k=0;k<cnt;k++){
									mx.offer(cx[k]);
									my.offer(cy[k]);
								}
								mx.offer(p);
								my.offer(j);
								break;
							}
						}
					}
				}
				cnt++;
				if(cnt>10){
					System.out.println(-1);
					break;	
				}else if(flag==true){
					System.out.println(cnt);
					break;
				}else if(x.size()==0){
					System.out.println(-1);
					break;	
				}
			}
			
		}	
	}	
}