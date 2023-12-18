import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String[] names = name.split("");
		System.out.println(names[0] + names[1] + names[2]);
		scanner.close();
	}
}
