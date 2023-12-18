import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int z=0;z<n;z++){
			int[][] map = new int[10][10];
			int[][] input = new int[10][10];
			int[][] ans = new int[10][10];
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					input[i][j] = sc.nextInt();
					map[i][j] = input[i][j];
				}
			}
			
			for(int k=0;k<1024;k++){
				StringBuffer sb = new StringBuffer(Integer.toBinaryString(k)).reverse();
				char[] a = sb.toString().toCharArray();
				ans = new int[10][10];

				for(int i=0;i<a.length;i++){
					if(a[i]=='1'){
						if(i!=0) map[0][i-1] = 1-map[0][i-1];
						map[0][i] = 1-map[0][i];
						map[1][i] = 1-map[1][i];
						if(i!=9) map[0][i+1] = 1-map[0][i+1];
						ans[0][i] = 1;
					}
				}
				
				for(int i=0;i<9;i++){
					for(int j=0;j<10;j++){
						if(map[i][j]==1){
							map[i][j] = 0;
							if(j!=0) map[i+1][j-1] = 1-map[i+1][j-1];
							map[i+1][j] = 1-map[i+1][j];
							if(j!=9) map[i+1][j+1] = 1-map[i+1][j+1];
							if(i!=8) map[i+2][j] = 1-map[i+2][j];
							ans[i+1][j] = 1;
						}
					}
				}
				
				boolean flag = false;
				for(int i=0;i<10;i++){
					for(int j=0;j<10;j++){
						if(map[i][j]==1) flag = true;
						map[i][j] = input[i][j];
					}
				}
				if(flag==false)	break;
			}
			
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					if(j!=0) System.out.print(" ");
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
		}
	}	
}