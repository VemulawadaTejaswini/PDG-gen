import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for(int i = 1 ; i <= n ; i++) {
			int temp = i; int sum = 0;
			for(int j = 0 ; j < 5 ; j++) {
				sum += temp % 10;
				temp /= 10;
				if(temp == 0) break;
			}
			if(a <= sum && sum <= b) ans += i;
		}
		System.out.println(ans);
	}
}
