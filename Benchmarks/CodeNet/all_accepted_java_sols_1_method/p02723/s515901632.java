import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String z = s.next();
		if (z.charAt(2) == z.charAt(3) && z.charAt(4) == z.charAt(5))
		{
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
