import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			if(i!=0) System.out.println();
			int m = sc.nextInt();
			int[][]  map = new int[m][m];
			int d = 0;
			int x = 0;
			int y = m-1;
			for(int j=0;j<m;j++){
				if(d==0){
					d = 1;
					for(int k=y;k>=0;k--){
						map[k][x] = 1;
						if(j!=0 && map[k-2][x]==1){
							y = k;
							break;
						}
						y = k;
					}
				}else if(d==1){
					d = 2;
					for(int k=x;k<m;k++){
						map[y][k] = 1;
						if(j!=1 && map[y][k+2]==1){
							x = k;
							break;
						}
						x = k;
					}
				}else if(d==2){
					d = 3;
					for(int k=y;k<m;k++){
						map[k][x] = 1;
						if(j!=2 && map[k+2][x]==1){
							y = k;
							break;
						}
						y = k;
					}
				}else if(d==3){
					d = 0;
					for(int k=x;k>=0;k--){
						map[y][k] = 1;
						if(map[y][k-2]==1){
							x = k;
							break;
						}
						x = k;
					}
				}
			}
			for(int j=0;j<m;j++){
				for(int k=0;k<m;k++){
					if(map[j][k]==0) System.out.print(" ");
					else System.out.print("#");
				}
				System.out.println();
			}
			
		}
	}	
}