import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		int tmp = 1;
		tmp = a + b;
		if(tmp%2==0) {
			System.out.println(tmp/2);
		}else {
			System.out.println("IMPOSSIBLE");
		}


	}
}