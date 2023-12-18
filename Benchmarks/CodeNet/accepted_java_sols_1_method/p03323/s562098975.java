import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String ans=(a<=8&&b<=8)?"Yay!":":(";
		System.out.println(ans);

	}
}
