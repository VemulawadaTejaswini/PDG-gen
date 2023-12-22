import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		int m = sc.nextInt();

		int h;

		while (true) {
			for (int i = 0; i < m; i++) {
				h = sc.nextInt();
				word = word.substring(h) + word.substring(0, h);
			}
			System.out.println(word);
			word = sc.next();
			if(word.equals("-")){
				break;
			}
			m = sc.nextInt();
		}

	}
}
