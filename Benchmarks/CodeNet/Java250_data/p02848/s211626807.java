import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		char ch1[] = str.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if ((ch1[i] + num) > 90)
				ch1[i] = (char) ((ch1[i] + num) % 90 + 64);
			else
				ch1[i] = (char) ((ch1[i] + num));
			System.out.print(ch1[i]);
		}
	}
}