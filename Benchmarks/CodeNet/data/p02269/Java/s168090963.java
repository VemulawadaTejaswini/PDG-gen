import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			String order = scanner.next();
			String value = scanner.next();
			if (order.equals("insert")) {
				strings.add(value);
			} else if (order.equals("find")) {
				if (strings.stream().anyMatch(e -> e.equals(value))) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
			
		}
	}

}