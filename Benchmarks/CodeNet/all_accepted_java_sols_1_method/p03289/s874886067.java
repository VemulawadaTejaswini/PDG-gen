import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		String check = S.toUpperCase();
		if(S.charAt(0) == 'A') {
			int count = 0;
			for(int i = 1; i < S.length(); i++) {
				if(i != 1 && i != S.length() - 1 && S.charAt(i) == 'C') {
					count++;
					continue;
				}
				if(S.charAt(i) == check.charAt(i)) {
					System.out.println("WA");
					return;
				}
			}
			if(count == 1) {
				System.out.println("AC");
			}else {
				System.out.println("WA");
			}
		}else {
			System.out.println("WA");
			return;
		}
	}

}