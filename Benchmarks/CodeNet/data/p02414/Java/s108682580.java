import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//System.out.print("2x3行列と3x2行列の積を求めます\n");

		int n = sc.nextInt(); // 3
		int m = sc.nextInt(); // 2
		int l = sc.nextInt(); // 3

		int a[][]=new int[n][n];
		int b[][]=new int[m][l];
		int c[][]=new int[n][l];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
//				System.out.print("a["+i+"]["+j+"]=");
				int num=sc.nextInt();
				a[i][j]=num;
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<l;j++){
//				System.out.print("b["+i+"]["+j+"]=");
				int num=sc.nextInt();
				b[i][j]=num;

			}
		}

		sc.close();

		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				int sum=0;
				for(int k=0;k<m;k++){
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;

			}

		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j] + " ");
//				System.out.println("c["+i+"]["+j+"]="+c[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}
}

