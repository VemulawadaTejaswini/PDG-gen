
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			NavigableSet<Integer> taro = new TreeSet<Integer>();
			NavigableSet<Integer> hanako = new TreeSet<Integer>();
			for (int i = 0; i < n; i++)
				taro.add(scanner.nextInt());
			for (int i = 1; i <= n * 2; i++)
				if (!taro.contains(i))
					hanako.add(i);

			boolean flag = true;
			Integer table = null;
			NavigableSet<Integer> pc = taro;
			while (!taro.isEmpty() && !hanako.isEmpty()) {
				if (table == null)
					table = pc.pollFirst();
				else {
					if ((table = pc.higher(table)) != null)
						pc.remove(table);
				}
				pc = (taro.equals(pc)) ? hanako : taro;
			}
			System.out.println(hanako.size());
			System.out.println(taro.size());
		}
	}
}