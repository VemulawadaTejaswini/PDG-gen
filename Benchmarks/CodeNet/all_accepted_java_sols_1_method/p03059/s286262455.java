import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int b = s.nextInt();
			int t = s.nextInt();
			System.out.println(t / a * b);
		}
	}

}
