import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		try (Scanner scanner = new Scanner(System.in)) {

			int n = scanner.nextInt();
			int q = scanner.nextInt();

			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(scanner.nextInt());
			}

			for (int i = 0; i < q; i++) {
				List<Integer> subList = list.subList(scanner.nextInt() - 1, scanner.nextInt());
				List<Integer> uniqueList = new ArrayList<Integer>(new HashSet<Integer>(subList));

				System.out.println(uniqueList.size());
			}
		}
	}
}