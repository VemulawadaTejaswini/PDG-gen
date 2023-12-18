import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[][] sheet = new int[n][n];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					sheet[i][j] = scan.nextInt();
				}
			}
			int[] row = new int[n];
			int[] col = new int[n];
			int sum = 0;
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					sum += sheet[i][j];
					row[i] += sheet[i][j];
					col[j] += sheet[i][j];
				}
			}
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					System.out.printf("%5d",sheet[i][j]);
				}
				System.out.printf("%5d\n",row[i]);
			}
			for(int i = 0;i < n;i++){
				System.out.printf("%5d",col[i]);
			}
			System.out.printf("%5d\n",sum);
		}
	}
}