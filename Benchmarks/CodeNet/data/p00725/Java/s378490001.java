import java.util.*;


public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true){
				int w = sc.nextInt(), h = sc.nextInt();

				if(w==0&&h==0){
					sc.close();
					break;
				}

				int[][] f = new int[h][w];
				int ch = 0, cw = 0;

				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						f[i][j] = sc.nextInt();
						if(f[i][j]==2){
							ch = i;
							cw = j;
						}
					}
				}

				int ret = solve(f,ch,cw,1,11);
				
				System.out.println((ret>10)?-1:ret);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int solve(int[][] f, int ch, int cw, int n, int min){
		if(n>10||n>min) return 11;
		int ret = 11;
		
		//up
		if(ch>=1&&f[ch-1][cw]!=1){
			int i = ch-1, j = cw;
			while(true){
				if(i<0){
					ret = 11;
					break;
				} else if(f[i][j]==1){
					f[i][j] = 0;
					ret = solve(f,i+1,j,n+1,min);
					f[i][j] = 1;
					break; 
				} else if(f[i][j]==3){
					ret = n;
					break;
				}
				i--;
			}
		}
		if(ret<min) min = ret;

		//right
		if(cw<f[0].length-1&&f[ch][cw+1]!=1){
			int i = ch, j = cw+1;
			while(true){
				if(j>=f[0].length){
					ret = 11;
					break;
				} else if(f[i][j]==1){
					f[i][j] = 0;
					ret = solve(f,i,j-1,n+1,min);
					f[i][j] = 1;
					break;
				} else if(f[i][j]==3){
					ret = n;
					break;
				}
				j++;
			}
		}
		if(ret<min) min = ret;


		//down
		if(ch<f.length-1&&f[ch+1][cw]!=1){
			int i = ch+1, j = cw;
			while(true){
				if(i>=f.length){
					ret = 11;
					break;
				} else if(f[i][j]==1){
					f[i][j] = 0;
					ret = solve(f,i-1,j,n+1,min);
					f[i][j] = 1;
					break;
				} else if(f[i][j]==3){
					ret = n;
					break;
				}
				i++;
			}
		}
		if(ret<min) min = ret;


		//left
		if(cw>0&&f[ch][cw-1]!=1){
			int i = ch, j = cw-1;
			while(true){
				if(j<0){
					ret = 11;
					break;
				} else if(f[i][j]==1){
					f[i][j] = 0;
					ret = solve(f,i,j+1,n+1,min);
					f[i][j] = 1;
					break;
				} else if(f[i][j]==3){
					ret = n;
					break;
				}
				j--;
			}
		}
		if(ret<min) min = ret;

		return min;
	}
}