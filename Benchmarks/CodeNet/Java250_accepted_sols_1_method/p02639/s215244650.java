import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<String> list = new LinkedList<String>();

		while (sc.hasNext()) {
			list.add(sc.next());
		}

		sc.close();

		int ans = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("0")) {
				ans = i + 1;
			}
		}

		System.out.println(ans);

	}

}