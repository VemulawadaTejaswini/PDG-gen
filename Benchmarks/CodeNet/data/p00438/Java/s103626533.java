import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			if(a == 0 && b == 0){
				break;
			}
			
			int[][] count = new int[b][a];
			
			final int n = sc.nextInt();
			
			for(int i = 0; i < n; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				count[y][x] = -1;
			}
			
			for(int i = 0; i < b; i++){
				for(int j = 0; j < a; j++){
					if(i == 0 && j == 0){
						count[i][j] = count[i][j] != -1 ? 1 : -1;
					}else if(i == 0){
						count[i][j] = count[i][j] != -1 ? count[i][j-1] : -1;
					}else if(j == 0){
						count[i][j] = count[i][j] != -1 ? count[i-1][j] : -1;
					}else{
						if(count[i][j] == -1){
							count[i][j] = -1;
						}else if(count[i][j-1] == -1 && count[i-1][j] == -1){
							count[i][j] = -1;
						}else if(count[i][j-1] == -1){
							count[i][j] = count[i-1][j];
						}else if(count[i-1][j] == -1){
							count[i][j] = count[i][j-1];
						}else{
							count[i][j] = count[i][j-1] + count[i-1][j];
						}
					}
				}
			}
			/*
			for(int i = 0; i < b; i++){
				for(int j = 0; j < a; j++){
					System.out.print(count[i][j] + " ");
				}
				System.out.println();
			}
			*/
			
			System.out.println(count[b-1][a-1]);
		}
	}
}