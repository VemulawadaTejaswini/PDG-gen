import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		int d = stdin.nextInt();

		if(a == b && c == d) {
			if(Math.sqrt(a * a + b * b) == Math.sqrt(c * c + d * d)){
				System.out.println("Yes");
			} else {
				System.out.println("no");
			}
		} else if (a == c && b == d) {
			
			if(Math.sqrt(a * a + c * c) == Math.sqrt(b * b + d * d)){
				System.out.println("Yes");
			} else {
				System.out.println("no");
			}
		}  else if (a == d && b == c) {
			if(Math.sqrt(a * a + d * d) == Math.sqrt(b * b + c * c)){
				System.out.println("Yes");
			} else {
				System.out.println("no");
			}
		} else {
			System.out.println("no");
		}
	}

}