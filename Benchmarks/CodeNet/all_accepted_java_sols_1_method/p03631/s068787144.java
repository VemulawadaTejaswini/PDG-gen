import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String N = sc.next();
		
		if (N.toCharArray()[0] == N.toCharArray()[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
