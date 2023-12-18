
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a <= b) {
			if(b <= c) {
				System.out.printf("%d %d %d\n", a, b, c);
				System.exit(0);
			} else if(a <= c) {
				System.out.printf("%d %d %d\n", a, c, b);
				System.exit(0);
			}
		}

		if(b <= a){
			if(a <= c) {
				System.out.printf("%d %d %d\n", b, a, c);
				System.exit(0);
			} else if(b <= c) {
				System.out.printf("%d %d %d\n", b, c, a);
				System.exit(0);
			}
		}

		if(c <= a){
			if(a <= b){
				System.out.printf("%d %d %d\n", c, a, b);
				System.exit(0);
			} else if(c <= b) {
				System.out.printf("%d %d %d\n", c, b, a);
				System.exit(0);
			}
		}
	}
}