import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int l = scanner.nextInt();
		List<String> list = new ArrayList<>();

		for(int i=0; i<n;i++) {
			list.add(scanner.next());
		}

		Collections.sort(list);

		for(String str :list) {
			System.out.print(str);
		}

	}
}