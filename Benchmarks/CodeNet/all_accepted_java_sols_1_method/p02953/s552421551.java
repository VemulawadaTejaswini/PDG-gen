
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		String[] hArray = sc.nextLine().split(" ");
		List<String> hList = Arrays.asList(hArray);

		int current = -1;

		ListIterator<String> ite = hList.listIterator(hList.size());
		while(ite.hasPrevious()) {

			int i = Integer.parseInt(ite.previous());
			if(current == -1) {

				current = i;

			} else {

				if(i - current >= 2) {

					System.out.println("No");
					System.exit(0);

				} else if(i - current != 1) {

					current = i;

				}

			}

		}

		System.out.println("Yes");
		sc.close();

	}

}
