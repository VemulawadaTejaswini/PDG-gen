import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		int count = 0;
		String W = scan.nextLine();
		if (W.length() <= 10) {
			while (scan.hasNext()) {
				String T = scan.nextLine();
				if ("END_OF_TEXT".equals(T)) {
					break;
				} else {
					String[] in = T.split(" ");
					for (int i = 0; i < in.length; i++) {
						String str = in[i];
						if (str.length() <= 10) {
							if (W.equalsIgnoreCase(str)) {
								count++;
							}
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}