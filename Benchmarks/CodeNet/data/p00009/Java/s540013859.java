import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {
			LinkedList<Integer> primeList = new LinkedList<Integer>();
			LinkedList<Integer> searchList = new LinkedList<Integer>();
			int n = Integer.parseInt(scan.next());

			if (n >= 2) {
				primeList.add(2);
			}

			if (n >= 3) {
				for (int i = 3; i <= n; i += 2) {
					searchList.add(i);
				}

				while (searchList.getLast() >= primeList.getLast() * primeList.getLast()) {
					for (Iterator<Integer> iterator = searchList.iterator(); iterator.hasNext();) {

						if (iterator.next() % primeList.getLast() == 0) {
							iterator.remove();
						}
					}
					primeList.add(searchList.removeFirst());

				}
			}

			primeList.addAll(searchList);

			System.out.println(primeList.size());
		}
	}
}