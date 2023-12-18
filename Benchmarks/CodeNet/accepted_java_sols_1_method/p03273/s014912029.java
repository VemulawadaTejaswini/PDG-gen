
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			String tmp = sc.nextLine();
			String[] str = new String[h];
			boolean[] isWhiteH = new boolean[h];
			boolean[] isWhiteW = new boolean[w];
			for (int j = 0; j < w; j++) {
				isWhiteW[j] = true;
			}
			for (int i = 0; i < h; i++) {
				str[i] = sc.nextLine();
				if (str[i].indexOf('#') == -1) {
					isWhiteH[i] = true;
				} else {
					isWhiteH[i] = false;
				}
				for (int j = 0; j < w; j++) {
					if(str[i].charAt(j) == '#') {
						isWhiteW[j] = false;
					}
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!isWhiteH[i] && !isWhiteW[j]) {
						System.out.print(String.valueOf(str[i].charAt(j)));
					}
				}
				if (!isWhiteH[i])
					System.out.println();
			}
		}
	}
}
