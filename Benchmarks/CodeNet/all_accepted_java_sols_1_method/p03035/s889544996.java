import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();

		if(n<=5) {
			System.out.println(0);
		}else if(n>12) {
			System.out.println(b);
		}else {
			System.out.println(b/2);
		}

	}
}


