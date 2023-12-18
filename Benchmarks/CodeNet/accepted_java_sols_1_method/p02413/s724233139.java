import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		int c=scan.nextInt();
		int[][] matrix=new int[r+1][c+1];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix[i][j]=scan.nextInt();
				matrix[i][c]+=matrix[i][j];
			}
		}
		for(int i=0;i<=c;i++){
			for(int j=0;j<r;j++){
				matrix[r][i]+=matrix[j][i];
			}
		}
		for(int i=0;i<=r;i++){
			System.out.print(matrix[i][0]);
			for(int j=1;j<=c;j++){
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}