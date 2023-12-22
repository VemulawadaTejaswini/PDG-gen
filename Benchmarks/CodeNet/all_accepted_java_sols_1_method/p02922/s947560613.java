import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = 1;
		int p = a;

		while(p < b) {
			p += a-1;
			c++;
		}

		if(b == 1) {
			System.out.println(0);
			return;
		}
		System.out.println(c);
		return;
	}
}
