import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int m=sc.nextInt();
	private static int[][] a=new int[n][m];
	private static int[] b=new int[m];
	public static void main(String[] args){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=0;j<m;j++){
				sum+=a[i][j]*b[j];
			}
			System.out.println(sum);
		}
	}
}