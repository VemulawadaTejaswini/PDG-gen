
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String op = sc.next();
			String str = sc.next();
			switch (op) {
			case "insert":
				list.add(str);
				break;
			case "find":
				if (list.contains(str)) System.out.println("yes");
				else System.out.println("no");
				break;
			}
		}
	}
}

