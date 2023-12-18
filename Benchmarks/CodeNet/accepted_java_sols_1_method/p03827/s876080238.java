import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int max = x;
		int n = scan.nextInt();
		char[] c = scan.next().toCharArray();
		for (int i = 0; i < n; i++) {
			if (c[i] == 'I') {
				x++;
				if (x > max) {
					max = x;
				}
			}
			if (c[i] == 'D') {
				x--;
			}
		}
		System.out.println(max);
	}
}
