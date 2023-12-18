package p0102;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int[][] a  = new int[n+1][n+1];
			for(int i =0;i<n;i++){
				for(int j = 0;j < n;j++){
					a[i][j]=cin.nextInt();
				}
			}
			int sum1=0;
			int sum2=0;
			int sum3=0;
			for(int i = 0;i<n;i++){
				for(int j = 0;j < n;j++){
					sum1+=a[i][j];
					sum2+=a[j][i];
				}
				a[i][n]=sum1;
				a[n][i]=sum2;
				sum3+=sum1;
				sum1=sum2=0;
				
			}
			a[n][n]=sum3;
			for(int i = 0;i<=n;i++){
				for(int j = 0;j <= n;j++){
					System.out.printf("%5d",a[i][j]);
				}
				System.out.println();
			}
		}

	}

}