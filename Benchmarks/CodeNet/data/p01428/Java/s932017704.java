import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[8][8];
		for(int i=0;i<8;i++){
			char[] s = sc.next().toCharArray();
			for(int j=0;j<8;j++){
				if(s[j]=='x') map[i][j] = 1;
				else if(s[j]=='.') map[i][j] = 2;
			}
		}
		
		int[] p = new int[]{1,1,1,0,-1,-1,-1,0};
		int[] q = new int[]{1,0,-1,-1,-1,0,1,1};
		int cnt, max, mx, my;
		boolean flag;
		while(true){
			flag = false;
			for(int z=0;z<2;z++){
				mx = -1;
				my = -1;
				max = 0;
				for(int y=0;y<8;y++){
					for(int x=0;x<8;x++){
						if(map[y][x]==2){
							cnt = 0;
							for(int i=0;i<8;i++){
								for(int j=1;;j++){
									if(0<=x+j*p[i] && x+j*p[i]<8 && 0<=y+j*q[i] && y+j*q[i]<8){
										if(map[y+j*q[i]][x+j*p[i]]==z){
											cnt += (j-1);
											break;
										}
										else if(map[y+j*q[i]][x+j*p[i]]==2) break;
									}else{
										break;
									}
								}
							}
							if(cnt>0){
								flag = true;
								if(cnt>max-z){
									max = cnt;
									mx = x;
									my = y;
								}
							}
						}
					}
				}
				
				if(mx!=-1){
					map[my][mx] = z;
					for(int i=0;i<8;i++){
						for(int j=1;;j++){
							if(0<=mx+j*p[i] && mx+j*p[i]<8 && 0<=my+j*q[i] && my+j*q[i]<8){
								if(map[my+j*q[i]][mx+j*p[i]]==2) break;
								else if(map[my+j*q[i]][mx+j*p[i]]==z){
									for(int k=1;k<j;k++) map[my+k*q[i]][mx+k*p[i]] = z;
									break;
								}
							}else{
								break;
							}
						}
					}
				}
			}
			if(flag==false) break;
		}
		
		for(int u=0;u<8;u++){
			for(int v=0;v<8;v++){
				if(map[u][v]==0) System.out.print("o");
				else if(map[u][v]==1) System.out.print("x");
				else System.out.print(".");
			}
			System.out.println();
		}
	}	
}