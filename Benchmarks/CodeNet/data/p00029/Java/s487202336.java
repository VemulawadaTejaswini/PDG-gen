import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		String st = sc.nextLine();
		String[] str = st.split(" ");
		int[] num = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (i != j) {
					if (str[i].equals(str[j])) {
						num[i]++;
					}
				}
			}
		}

		int maxf = 0;
		for (int i = 1; i < str.length; i++) {
			if (num[i] > num[maxf]) {
				maxf = i;
			}
		}

		int maxl = 0;
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() > str[maxl].length()) {
				maxl = i;
			}
		}

		System.out.println(str[maxf] + " " + str[maxl]);

	}

}