import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TH = sc.nextInt();
		int TA = sc.nextInt();
		int AH = sc.nextInt();
		int AA = sc.nextInt();
		int turn = 1;

		while (TH > 0 && AH > 0) {
			if (turn % 2 == 1) {
				AH = AH - TA;
			} else {
				TH = TH - AA;
			}
			turn++;
		}

		if (TH <= 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
