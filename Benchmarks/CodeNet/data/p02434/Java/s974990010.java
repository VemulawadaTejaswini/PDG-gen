import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<>();
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < q; i++) {
			switch (sc.nextInt()) {
				case 0:
					list.get(sc.nextInt()).add(sc.nextInt());
					break;
				case 2:
					list.set(sc.nextInt(), new ArrayList<>());
					break;
				case 1:
					List<Integer> tmp = list.get(sc.nextInt());
					for (int j = 0; j < tmp.size(); j++) {
						System.out.print(tmp.get(j));
						if (j < tmp.size() - 1) {
							System.out.print(" ");
						}
					}
					System.out.println();
					break;
			}
		}
	}
}
