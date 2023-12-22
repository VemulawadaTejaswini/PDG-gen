import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		int[] n = new int[4];
		n[0] = Integer.parseInt(sc.next());
		n[1] = Integer.parseInt(sc.next());
		n[2] = Integer.parseInt(sc.next());
		n[3] = Integer.parseInt(sc.next());
		sc.close();

		for (int i=0; i<4; i++) {

			for (int j=0; j<4; j++) {

				if(i==j) {
					continue;
				}

				for (int k=0; k<4;k++) {

					if(j==k) {
						continue;
					}

					for(int l=0; l<4; l++) {

						if(k==l) {
							continue;
						}

						if(n[i] == 1 && n[j] == 9 && n[k] == 7 && n[l] == 4 ) {
							System.out.println("YES");
							return;
						}
					}


				}
			}
		}

		System.out.println("NO");
	}
}
