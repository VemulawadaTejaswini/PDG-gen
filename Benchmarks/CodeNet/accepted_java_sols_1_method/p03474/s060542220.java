import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String string = sc.next();
		if (string.matches("[0-9]{"+A+"}-[0-9]{"+B+"}")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}


