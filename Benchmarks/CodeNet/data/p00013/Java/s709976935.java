import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		while (sc.hasNext()) {
			int i = sc.nextInt();
			if (i == 0) {
				System.out.println(list.get(0));
				list.remove(0);
			} else {
				list.add(0, i);
			}
		}

	}
}