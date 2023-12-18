import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char one = s.charAt(0);
		char two = s.charAt(1);
		char three = s.charAt(2);

		int count = 0;

		if (one == 'R')
			count++;
		if (two == 'R')
			count++;
		if (three == 'R')
			count++;

		if (count == 3) {
			print(3);
			return;
		}
		if (count == 2) {
			if (one == 'R' && three == 'R') {
				print(1);
				return;
			}
			print(2);
			return;
		}
		if (count == 1) {
			print(1);
			return;
		}
		print(0);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}