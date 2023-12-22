import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		int i = 1;
		while (i <= line) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			i++;
		}
	}

}