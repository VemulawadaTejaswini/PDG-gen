import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		String target = "";
		List<String> stringList = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			String inputStr = scanner.nextLine();
			stringList.add(inputStr);
		}
		Collections.sort(stringList);
		for (int i = 0; i <= N; i++) {
			target += stringList.get(i);
		}
		System.out.println(target);
	}
}

