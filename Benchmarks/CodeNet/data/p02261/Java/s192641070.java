import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] cards = sc.nextLine().split(" ");
		String[] cardsbub = cards.clone();
		String[] cardssel = cards.clone();

		bubble(cardsbub, n);
		for (int i=0; i < n-1; i++) {
			System.out.print(cardsbub[i] + " ");
		}
		System.out.println(cardsbub[n-1]);
		System.out.println("Stable");

		selection(cardssel, n);
		for (int i=0; i < n-1; i++) {
			System.out.print(cardssel[i] + " ");
		}
		System.out.println(cardssel[n-1]);
		if ( isStable(cards, cardssel, n) ) System.out.println("Stable");
		else System.out.println("Not stable");

	}

	static void bubble(String[] c, int n) { // c:cards, n:c.length

		for (int i=0; i < n; i++) {
			for (int j=n-1; i+1 <= j; j--) {
				// cj:c[j].value, cjm1:c[j-1].value
				int cj = Integer.parseInt( c[j].substring(1, 2) );
				int cjm1 = Integer.parseInt( c[j-1].substring(1, 2) );

				if (cjm1 > cj) {
					String temp = c[j-1];
					c[j-1] = c[j];
					c[j] = temp;
				}
			}
		}

	}

	static void selection(String[] c, int n) {

		for (int i=0; i < n; i++) {

			int minj = i;
			for (int j=i; j < n; j++) {
				// cj:c[j].value, cminj:c[minj].value
				int cj = Integer.parseInt( c[j].substring(1, 2) );
				int cminj = Integer.parseInt( c[minj].substring(1, 2) );

				if (cminj > cj) {
					minj = j;
				}
			}

			/*
			 * ... c[i] ... c[minj] ...
			 *     c[i] >= c[minj]
			 */
			String temp = c[minj];
			c[minj] = c[i];
			c[i] = temp;

		}
	}

	static boolean isStable(String[] in, String[] out, int n) {

		for (int i=0; i < n; i++) {
			for (int j=i+1; j < n; j++) {

				for (int a=0; a < n; a++) {
					for (int b=a+1; b < n; b++) {

						int ini = Integer.parseInt( in[i].substring(1, 2) );
						int inj = Integer.parseInt( in[j].substring(1, 2) );
						int outa = Integer.parseInt( in[a].substring(1, 2) );
						int outb = Integer.parseInt( in[b].substring(1, 2) );

						/*
						 * cards in : ... in[i]  ... in[j] ...
						 * cards out: ... out[a] ... out[b] ...
						 *
						 */
						if ( ini == inj &&
								in[i].equals(out[b]) &&
								in[j].equals(out[a]) ) {
							return false;
						}

					}
				}

			}
		}
		return true;

	}
}