import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x2000 = sc.nextInt();

		for(int i=0;i<10;i++) {
			int x = r*x2000-d;
			System.out.println(x);
			x2000 = x;
		}

		sc.close();

	}

}
