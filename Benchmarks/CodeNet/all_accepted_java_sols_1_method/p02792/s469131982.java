


import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		int n = sc.nextInt();
		long[][] count = new long[10][10];
		for (int i=1;i<=n;i++) {
			int j=i;
			while(j>=10) {
				j/=10;
			}
			count[j][i%10]++;
		}
		for (int i=1;i<=9;i++) {
			for (int j=1;j<=9;j++) {
				ans += (count[i][j]*count[j][i]);
			}
		}
		System.out.println(ans);
	}
}



