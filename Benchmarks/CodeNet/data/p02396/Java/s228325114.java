import java.util.*;

public class Main {
	public static void main(String[] args) {
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if (x == 0)
				break;
			System.out.println(x);
		}
	}
}