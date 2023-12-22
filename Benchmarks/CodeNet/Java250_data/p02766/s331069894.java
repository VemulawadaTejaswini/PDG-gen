import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 1;
		int unchange = K;

		while(N/K>0) {
			ans++;
			K = K*unchange;
		}

		System.out.println(ans);
	}
}