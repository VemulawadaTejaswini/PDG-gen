import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = null;

		try {

			sc = new Scanner(System.in);
			int hit = 0;
			int blow = 0;

			while (sc.hasNext()) {

				String[] a = sc.nextLine().split(" ");
				String[] b = sc.nextLine().split(" ");

				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b.length; j++) {

						if (a[i].equals(b[i])) {
							hit++;
							break;
						} else if (a[i].equals(b[j])) {

							blow++;
							break;
						}
					}
				}

				System.out.println(hit + " " + blow);

			}

		} finally {
			sc.close();
		}

	}

}