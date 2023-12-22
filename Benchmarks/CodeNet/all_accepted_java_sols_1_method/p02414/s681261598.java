import java.util.Arrays;
import java.util.Scanner;



public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int l=scan.nextInt();

		int[][] matrix_nm=new int[n][m];
		int[][] matrix_ml=new int[m][l];
		long[][] matrix_nl=new long[n][l];

		for(int i=0;i<n;i++){
		Arrays.fill(matrix_nl[i], 0);
		}//???????????????0??§?????????

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				matrix_nm[i][j]=scan.nextInt();
			}
		}

		for(int i=0;i<m;i++){
			for(int j=0;j<l;j++){
				matrix_ml[i][j]=scan.nextInt();
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				for(int k=0;k<m;k++){
				matrix_nl[i][j]+=(matrix_nm[i][k])*(matrix_ml[k][j]);//??£??\??????????????°????????????
				}
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				System.out.print(matrix_nl[i][j]);
				if(j<l-1){System.out.print(" ");}
			}System.out.println();
		}


		scan.close();
}


}