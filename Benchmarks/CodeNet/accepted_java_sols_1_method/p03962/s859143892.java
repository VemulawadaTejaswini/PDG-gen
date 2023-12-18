import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashSet hs = new HashSet();
		hs.add(scanner.nextInt());
		hs.add(scanner.nextInt());
		hs.add(scanner.nextInt());

		System.out.println(hs.size());

		scanner.close();
	}
}