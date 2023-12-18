import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean go = true;
		for(int i=0;i<n;i++){
			if(go==false) System.out.println();
			go = false;
			
			int[][] map = new int[9][9];
			int[][] check = new int[9][9];
			
			for(int j=0;j<9;j++){
				for(int k=0;k<9;k++){
					map[j][k] = sc.nextInt();
				}
			}
			
			int[] list;
			for(int j=0;j<9;j++){
				list = new int[10];
				for(int k=0;k<9;k++){
					list[map[j][k]]++;
				}
				for(int k=1;k<=9;k++){
					if(list[k]>1){
						for(int p=0;p<9;p++){
							if(map[j][p]==k) check[j][p]++;
						}
					}
				}
			}
			
			for(int j=0;j<9;j++){
				list = new int[10];
				for(int k=0;k<9;k++){
					list[map[k][j]]++;
				}
				for(int k=1;k<=9;k++){
					if(list[k]>1){
						for(int p=0;p<9;p++){
							if(map[p][j]==k) check[p][j]++;
						}
					}
				}
			}

			for(int j=0;j<9;j+=3){
				for(int k=0;k<9;k+=3){
					list = new int[10];
					for(int p=0;p<3;p++){
						for(int q=0;q<3;q++){
							list[map[j+p][k+q]]++;
						}
					}
					for(int r=1;r<=9;r++){
						if(list[r]>1){
							for(int p=0;p<3;p++){
								for(int q=0;q<3;q++){
									if(map[j+p][k+q]==r) check[j+p][k+q]++;
								}
							}
						}
					}
				}
			}
				
			for(int j=0;j<9;j++){
				for(int k=0;k<9;k++){
					if(check[j][k]==0) System.out.print(" ");
					else System.out.print("*");
					System.out.print(map[j][k]);
				}
				System.out.println();
			}		
		}
	}	
}