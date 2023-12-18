import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String u = a.toUpperCase();
		sc.close();
		if (a.equals(u)) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}
