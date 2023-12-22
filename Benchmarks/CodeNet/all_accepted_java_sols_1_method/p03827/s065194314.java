import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int x = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I') {
				x++;
				if (x > max) {
					max = x;
				}
			} else {
				x--;
			}
		}
		System.out.println(max);
	}
}