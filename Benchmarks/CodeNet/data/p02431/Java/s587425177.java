
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for(int i = 0; i < a; i++) {
			int x = sc.nextInt();
			if (x == 0) {
				list.add(sc.nextInt());
			} else if (x == 1) {
				System.out.println(list.get(sc.nextInt()));
			} else {
				list.remove(list.size()-1);
			}
		}

	}

}

