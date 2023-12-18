import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {

			int listA[] = createList();
			int listB[] = createList();

			int hit = 0;
			int blow = 0;

			for (int i = 0; i < 4; i++) {
				if (listA[i] == listB[i]) {
					hit++;
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (listA[i] == listB[j]) {
						blow++;
					}
				}
			}
			blow = blow - hit;

			System.out.println(hit + " " + blow);
		}
	}

	public static int[] createList() {
		int list[] = new int[4];

		for (int i = 0; i < 4; i++) {
			list[i] = sc.nextInt();
		}
		return list;
	}
}