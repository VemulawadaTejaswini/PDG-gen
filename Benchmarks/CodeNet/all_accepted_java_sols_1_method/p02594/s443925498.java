import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		scanner.close();

		if (temp >= 30) System.out.println("Yes");
		else System.out.println("No");
		
	}
}