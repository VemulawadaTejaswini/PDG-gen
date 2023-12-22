import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans = 0;
		if(A + B <= C*2)
			ans = A*X + B*Y;
		else {
			if(X >= Y) {
				ans = Math.min(A*(X-Y) + 2*C*Y, 2*C*X);
			}
			else {
				ans = Math.min(2*C*X + B*(Y-X), 2*C*Y);
			}
		}
		System.out.println(ans);

	}

}