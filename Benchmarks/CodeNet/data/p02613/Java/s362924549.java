import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C0 = 0, C1 = 0, C2 = 0, C3 = 0;
		for (int i = 0; i < N; ++i) {
			String S = sc.nextLine();
			if (S.equals("AC"))
				++C0;
			else if (S.equals("WA"))
				++C1;
			else if (S.equals("TLE"))
				++C2;
			else
				++C3;
		}
		System.out.println("AC x " + C0);
		System.out.println("WA x " + C1);
		System.out.println("TLE x " + C2);
		System.out.println("RE x " + C3);
	}
}
