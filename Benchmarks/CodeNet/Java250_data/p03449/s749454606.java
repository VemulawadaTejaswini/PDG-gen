import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[][] = new int[3][n + 1];
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			a[1][i] = sc.nextInt();
		}
		sum += a[1][1];
		for (int i = 1; i <= n; i++) {
			a[2][i] = sc.nextInt();
			sum += a[2][i];
		}
		int ans = sum;
		for (int i = 2; i <= n; i++) {
sum=sum-a[2][i-1]+a[1][i];
if(ans<=sum){
	ans=sum;
}
		}
		System.out.println(ans);
	}
}
