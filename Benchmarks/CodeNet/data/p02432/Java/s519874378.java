import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
			for (int i = 0; i < q; i++) {


				switch (Integer.parseInt(sc.next())) {
				case 0:

						if ( Integer.parseInt(sc.next()) == 0 ) {
							A.add(0, Integer.parseInt(sc.next()));
						} else {
							A.add(Integer.parseInt(sc.next()));
						}

					break;
				case 1:
					System.out.println(A.get(Integer.parseInt(sc.next())));
					break;
				case 2:

					if ( Integer.parseInt(sc.next()) == 0 ) {
						A.remove(0);
					} else {
						A.remove(A.size() - 1);
					}

					break;
				}
 			}
		sc.close();
	}
}
