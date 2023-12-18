import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		boolean[] alpha = new boolean[26];
		int count = 0;
		for (String string : input) {
			int pos = string.toCharArray()[0]-97;
			if (alpha[pos]) {
				continue;
			} else {
				alpha[pos] = true;
				count++;
				if (count == 26) {
					System.out.println("None");
					System.exit(0);
				}
			}
		}
		for (int i = 0; i < alpha.length; i++) {
			if (!alpha[i]) {
				System.out.println((char)(i+97));
				break;
			}

		}
	}
}