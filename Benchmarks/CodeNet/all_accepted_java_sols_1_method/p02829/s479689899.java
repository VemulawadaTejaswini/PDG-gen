import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a + b == 3) {
			System.out.println(3);
		}
		if(a + b == 4) {
			System.out.println(2);
		}
		if(a + b == 5) {
			System.out.println(1);
		}

		sc.close();



	}

}
