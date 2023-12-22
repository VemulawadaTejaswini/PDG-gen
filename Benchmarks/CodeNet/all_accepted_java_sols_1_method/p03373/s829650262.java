import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		int ans = 0;
		int sum1 = A*X + B*Y;
		int sum2 = 0;
		if(X > Y) {
			sum2 += (2*C*Y) + (A*(X - Y));
		}else {
			sum2 += (2*C*X) + (B*(Y - X));
		}
		int sum3 = X > Y ? 2*C*X : 2*C*Y;
		ans = Math.min(sum1, sum2);
		ans = Math.min(ans, sum3);
		System.out.println(ans);
	}
}