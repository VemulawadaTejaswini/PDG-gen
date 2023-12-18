import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			int aa = a;
			int bb = b;
			while (true) {
				if (a < b) {
					int t = a;
					a = b;
					b = t;
				}
				if(a%b == 0)break;
				a = a%b;
			}
			bb/=b;
			System.out.println(b+" "+(aa*bb));
		}
	}
}