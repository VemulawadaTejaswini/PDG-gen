import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		if (Arrays.asList(N.split("")).stream().filter(e -> e.equals("7")).count() > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
