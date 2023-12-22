import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[][] = new int[100][100];
		int b[]= new int[100];
		int sum[]=new int[100];
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				int c=scan.nextInt();
				a[i][j] +=c;
			}
		}
		for(i=0;i<m;i++) {
			int c=scan.nextInt();
			b[i] +=c;
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				sum[i] +=a[i][j]*b[j];
			}
			System.out.println(""+sum[i]);
		}
		scan.close();
}
}
