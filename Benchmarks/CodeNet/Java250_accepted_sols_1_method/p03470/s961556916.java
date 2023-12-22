import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());

			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int d = Integer.parseInt(sc.nextLine());
				if (!list.contains(d)) {
					list.add(d);
				}
			}

			System.out.println(list.size());

			sc.close();
		}
}