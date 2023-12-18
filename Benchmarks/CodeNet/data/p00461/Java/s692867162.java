import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c;
		String s;
		int I[], O[];
		int count;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			c = sc.nextInt();
			s = sc.next();
			I = new int[c];
			O = new int[c];
			
			if (s.charAt(0) == 'I') {
				I[0] = 1;
			}
			for (int i = 1; i < c; i++) {
				if (s.charAt(i) == 'I') {
					I[i] = O[i - 1] + 1;
				} else {
					O[i] = I[i - 1];
				}
			}
			count = 0;
			for (int i = 0; i < c; i++) {
				if (n <= I[i] - 1) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}