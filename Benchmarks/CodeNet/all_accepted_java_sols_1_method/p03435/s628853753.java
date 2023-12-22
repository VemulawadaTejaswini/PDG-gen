import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c1 = sc.nextInt();
		int c2= sc.nextInt();
		int c3 = sc.nextInt();
		int c4 = sc.nextInt();
		int c5 = sc.nextInt();
		int c6 = sc.nextInt();
		int c7 = sc.nextInt();
		int c8 = sc.nextInt();
		int c9 = sc.nextInt();

		int flag = 0;

		ArrayList<Integer> Aarray = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			Aarray.add(0);
		}
		ArrayList<Integer> Barray = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			Barray.add(0);
		}

		loop: for (int i = 0; i < 100; i++) {
			Aarray.set(0, i);
			Barray.set(0, c1 - Aarray.get(0));
			Barray.set(1, c2 - Aarray.get(0));
			Barray.set(2, c3 - Aarray.get(0));

			for (int j = 0; j < 2; j++) {
				Aarray.set(1, c4 - Barray.get(j));

				for (int k = 0; k < 2; k ++) {
					Aarray.set(2, c7 - Barray.get(k));

					if (Aarray.get(1) + Barray.get(1) == c5
							&& Aarray.get(1) + Barray.get(2) == c6
							&& Aarray.get(2) + Barray.get(1) == c8
							&& Aarray.get(2) + Barray.get(2) == c9) {

						flag ++;
						break loop;
					}
				}
			}

		}
		if (flag == 1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
