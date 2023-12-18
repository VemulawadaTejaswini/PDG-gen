import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			if (str.endsWith("s")) {
				System.out.println(str + "es");
			} else {
				System.out.println(str + "s");
			}
		}
	}
}