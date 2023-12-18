import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		String s = scan.next();

		if(a >= 3200) {
			System.out.println(s);
		}else {
			System.out.println("red");
		}
	}
}