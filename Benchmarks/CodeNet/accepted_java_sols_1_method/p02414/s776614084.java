import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		int[][] mat1=new int[n][m];
		int[][] mat2=new int[m][l];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++) mat1[i][j]=sc.nextInt();
		for(int i=0;i<m;i++)
			for(int j=0;j<l;j++) mat2[i][j]=sc.nextInt();
		
		long sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				sum=0;
				for(int k=0;k<m;k++){
					sum+=mat1[i][k]*mat2[k][j];
				}
				System.out.print(sum);
				if(j!=l-1)System.out.print(" ");
			}
			System.out.println("");
		}
	}
}