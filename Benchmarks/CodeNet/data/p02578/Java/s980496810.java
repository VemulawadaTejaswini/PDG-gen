import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		int san = sc.nextInt();
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			if(san>=a) {
				ans += san-a;
			}
			else {
				san = a;
			}
		}
		System.out.println(ans);
	}
}
