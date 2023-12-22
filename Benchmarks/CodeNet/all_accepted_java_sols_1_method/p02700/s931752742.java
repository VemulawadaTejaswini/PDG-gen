import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		while(0 < c && 0 < a) {
			c -= b;
			if(c <= 0) {
				break;
			}
			a -= d;
		}
		if(0 < a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}