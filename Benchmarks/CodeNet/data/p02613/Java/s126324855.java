import java.util.Scanner;

// ABC173-B
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;

		for (String s : S) {
			if (s.equals("AC")) {
				AC++;
			}
			if (s.equals("WA")) {
				WA++;
			}
			if (s.equals("TLE")) {
				TLE++;
			}
			if (s.equals("RE")) {
				RE++;
			}
		}

		System.out.println("AC x " + AC);
		System.out.println("WA x " + WA);
		System.out.println("TLE x " + TLE);
		System.out.println("RE x " + RE);

		sc.close();
	}

}
