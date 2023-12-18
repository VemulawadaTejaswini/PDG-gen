import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		Set<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			int n = reader.nextInt();
			if (list.contains(n)) {
				list.remove(n);
			} else {
				list.add(n);
			}
		}


		System.out.print(list.size());
		reader.close();

	}

}



