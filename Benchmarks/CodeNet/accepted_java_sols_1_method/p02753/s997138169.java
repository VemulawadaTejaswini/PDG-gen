import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int cntA = 0;
		int cntB = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='A') {
				cntA++;
			} else {
				cntB++;
			}
		}
		
		if (cntA == 2 || cntB == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}