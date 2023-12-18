import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

		hs.put(500, scanner.nextInt());
		hs.put(100, scanner.nextInt());
		hs.put(50, scanner.nextInt());
		int total = scanner.nextInt();
		int success = 0;

		for(int i = 0; i <= hs.get(500); i++) {
			for(int j = 0; j <= hs.get(100); j++) {
				for(int k = 0; k <= hs.get(50); k++) {
					if(500 * i + 100 * j + 50 * k == total)success++;
				}
			}
		}

		System.out.println(success);

		scanner.close();
	}
}