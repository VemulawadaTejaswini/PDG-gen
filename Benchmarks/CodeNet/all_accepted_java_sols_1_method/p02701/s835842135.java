import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int times = Integer.parseInt(scanner.nextLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < times; i++) {
			map.put(scanner.nextLine(),1);
		}

		System.out.println(map.size());

	}
}