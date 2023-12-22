import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();

		char[] c = s.toCharArray();

		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < n; j++) {
				c[i]++;
				if(c[i] > 'Z') {
					c[i] -= 26;
				}
			}
		}

		System.out.println(c);

	}

}