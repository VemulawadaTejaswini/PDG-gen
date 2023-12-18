import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for(int i=0;i<10;i++) {
			System.out.println(n*c-b);
			c=n*c-b;
		}

	}
}


