import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int r=scan.nextInt();
			int c=scan.nextInt();
			int a[][] = new int[101][101];
			int sum1[] = new int[101];
			int sum[] =new int[101];
			int sum2=0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					a[i][j]=scan.nextInt();
					sum[i] +=a[i][j];
					sum1[j] +=a[i][j];
					if(i == r-1) {
						a[r][j] = sum1[j];
					}
				}
				a[i][c] =sum[i];
				sum2 += sum[i];
				if(i == r-1) {
					a[r][c] = sum2;
				}
			}
			for(int i=0;i<=r;i++) {
				for(int j=0;j<=c;j++) {
					System.out.printf(a[i][j]+" ");
				}
				System.out.println();
			}
		scan.close();
}
}
