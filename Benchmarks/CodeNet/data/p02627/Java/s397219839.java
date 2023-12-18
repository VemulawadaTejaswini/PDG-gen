import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String target = scan.nextLine();
		
		String bigAlpha = "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		String[] bigAlphaArray = bigAlpha.split("");
		
		String answer = Arrays.asList(bigAlphaArray).contains(target)
				? "A"
				: "a";

		println(answer);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
