import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int c = scan.nextInt();

		int[] b = new int[m];
		int[][] a = new int[n][m];
		int[] t = new int[m];
		int[] t1 = new int[n];

		int count = 0;
		int total = 0;

		for(int i=0;i<m;i++) {
			b[i] = scan.nextInt();
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = scan.nextInt();
				t[j]=a[i][j]*b[j];
				t1[i]+=t[j];
			}
		}

		for(int i=0;i<n;i++) {
			if(t1[i]+c>0) {
				count++;
			}
		}

		System.out.println(count);
	}

}
