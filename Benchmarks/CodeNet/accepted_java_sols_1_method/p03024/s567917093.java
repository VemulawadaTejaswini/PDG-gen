import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int count = 0;
		int j = 1;
		int restricao = 0;

		for (int i = 0; i < S.length(); i++) {
			restricao++;
			if (S.substring(i, j).equals("x")) {
				count++;
			}
			j++;
		}
		
		if (restricao >= 1 && restricao <= 15) {
			if (count < 8) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}