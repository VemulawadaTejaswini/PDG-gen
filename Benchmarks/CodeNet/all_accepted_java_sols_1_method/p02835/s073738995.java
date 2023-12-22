import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		if (a+b+c > 21) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
	}

}
