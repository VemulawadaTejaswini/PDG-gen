import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		scanner.close();

		String[] sarr = S.split("");
		int x = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			if(sarr[i].equals("I")) {
				x++;
			} else {
				x--;
			}
			if(x > max) {
				max = x;
			}
		}

		System.out.println(max);
	}

}
