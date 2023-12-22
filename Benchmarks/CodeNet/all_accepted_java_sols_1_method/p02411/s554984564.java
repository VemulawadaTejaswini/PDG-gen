import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		char result;

		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();

		for (; m != -1 || f != -1 || r != -1;) {
			if (m == -1 || f == -1) {
				result = 'F';
			} else if (m + f >= 80) {
				result = 'A';
			} else if (m + f >= 65) {
				result = 'B';
			} else if (m + f >= 50) {
				result = 'C';
			} else if (m + f >= 30) {
				if (r >= 50) {
					result = 'C';
				} else {
					result = 'D';
				}
			} else {
				result = 'F';
			}

			System.out.println(result);

			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
		
		sc.close();
	}
}