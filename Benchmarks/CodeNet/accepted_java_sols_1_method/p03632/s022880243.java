import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		int count = 0;
		int ans = 0;
		while(count < 101) {
			if(count >= A && count >= C &&
				count < B && count < D) {
				ans++;
			}
			count++;
		}
		System.out.println(ans);
	}
}
