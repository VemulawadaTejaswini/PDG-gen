import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();


		if(a == b) {
			System.out.println("Draw");
			System.exit(0);
		}
		if(a == 1 && b <= 13 && 2 <= b) {
			System.out.println("Alice");
			System.exit(0);
		}
		if(b == 1 && a <= 13 && 2 <= a) {
			System.out.println("Bob");
			System.exit(0);
		}
		if(a > b) {
			System.out.println("Alice");
		}else {
			System.out.println("Bob");
		}
	}
}