import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean f = false;

		for (int i = 1; i <= B; i++) {
			if (A * i % B == C) {
				f = true;
				break;
			}
		}

		if (f == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
