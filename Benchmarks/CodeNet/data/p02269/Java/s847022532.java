
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			switch (sc.next()) {
			case "insert":
				list.add(sc.next());
				break;
			case "find":
				if (list.contains(sc.next())) System.out.println("yes");
				else System.out.println("no");
				break;
			}
		}
	}
}

