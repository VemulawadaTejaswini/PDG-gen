

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] m=new int[101][101];
		int[] p=new int[101];
		for(int i=1;i<=n;i++){
			p[i-1]=scanner.nextInt();
			p[i]=scanner.nextInt();
		}
		
		for(int i=1;i<=n;i++)
			m[i][i]=0;
		for(int l=2;l<=n;l++){
			for(int i=1;i<=n-l+1;i++){
				int j=i+l-1;
				m[i][j]=(1<<21);
				for(int k=i;k<=j-1;k++){
					m[i][j]=Math.min(m[i][j],m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j]);
				}
			}
		}
		System.out.println(m[1][n]);
	}

}

