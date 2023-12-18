import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(C*2 < A+B) {
			int cNum = Math.min(X, Y)*2;
			int ans = cNum*C;
			X -= cNum/2;
			Y -= cNum/2;
			ans += Math.min(A, C*2)*Math.max(X, 0);
			ans += Math.min(B, C*2)*Math.max(Y, 0);
			System.out.println(ans);
		} else {
			System.out.println(A*X + B*Y);
		}
				
		sc.close();
	}
}
