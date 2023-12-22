import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String st = s.next();

		char[] cs = st.toCharArray();

		int max = 0;
		int tmp = 0;

		for (char c : cs) {
			if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
				tmp++;
			} else {
				if (tmp > max) {
					max = tmp;
				}
				tmp = 0;
			}
		}

		System.out.println(max < tmp ? tmp : max);
	}
}