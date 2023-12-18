import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int h = sc.nextInt();
                int w = sc.nextInt();

			if(h==0&&w==0) {
				System.exit(0);
			}

			int base = 0;
			base = h * h + w * w;//デフォの二乗

			int newnew = 0;

			int newI = 150;
			int newJ = 150;

			for (int i = 1; i < 150; i++) {
				for (int j = 1; j < 150; j++) {

					if(i>j) {
						continue;
					}

					if(i==j) {
						continue;
					}
					newnew = (i*i)+(j*j);
					if (newnew > base) {
						if (((newI * newI)+(newJ*newJ) )>newnew) {
							newI = i;
							newJ = j;
						}
					}
				}
			}
			System.out.println(newI + " " + newJ);

		}
		}
	}
}

