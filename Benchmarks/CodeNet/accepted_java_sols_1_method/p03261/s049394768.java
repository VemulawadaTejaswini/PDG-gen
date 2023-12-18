import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = Integer.valueOf(scn.nextLine()).intValue();
		String[] S = new String[N];
		boolean how = true;
		for (int i = 0; i < N; i++) {
			String str = scn.nextLine();
			for (int j = 0; j < i; j++) {
				if (str.equals(S[j])) {
					how = false;
					break;
				}
				if (j == i - 1) {
					String buf = S[i - 1];
					if (buf.charAt(buf.length() - 1) != str.charAt(0)) {
						how = false;
						break;
					}
				}
			}
			S[i] = str;
		}
		System.out.println(how?"Yes":"No");
		scn.close();
	}
}
