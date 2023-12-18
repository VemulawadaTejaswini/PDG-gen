import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		s = sc.next();
		int n;
		int R = 0;
		int B = 0;
		String S;
		for (n = 0; n < N; n++) {
			S = String.valueOf(s.charAt(n));
			if (S.equals("R")) {
				R++;
			} else {
				B++;
			}
		}
		if (R > B)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}