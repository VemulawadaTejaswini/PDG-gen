import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final String[] vars_check = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.next();
			if (line.equals("#")) {
				sc.close();
				break;
			}

			ArrayList<String> varsList = new ArrayList<String>();
			for (int i = 0; i < vars_check.length; i++) {
				if (line.indexOf(vars_check[i]) != -1) {
					varsList.add(vars_check[i]);
				}
			}
			String[] vars = varsList.toArray(new String[0]);

			boolean yes = true;
			for (int bit = 0; bit < (1 << vars.length); bit++) {
				String check = line;
				for (int j = 0; j < vars.length; j++) {
					String replace = "F";
					if ((bit & (1 << j)) != 0) {
						replace = "T";
					}
					check = check.replaceAll(vars[j], replace);
				}
				int length = check.length();
				while (true) {
					check = check.replaceAll("\\-T", "F");
					check = check.replaceAll("\\-F", "T");
					check = check.replaceAll("\\(T\\*T\\)", "T");
					check = check.replaceAll("\\(F\\*[TF]\\)", "F");
					check = check.replaceAll("\\([TF]\\*F\\)", "F");
					check = check.replaceAll("\\(F\\+F\\)", "F");
					check = check.replaceAll("\\([TF]\\+T\\)", "T");
					check = check.replaceAll("\\(T\\+[TF]\\)", "T");
					check = check.replaceAll("\\(T\\-\\>F\\)", "F");
					check = check.replaceAll("\\(T\\-\\>T\\)", "T");
					check = check.replaceAll("\\(F\\-\\>[TF]\\)", "T");
					if (check.length() == length) {
						break;
					}
					length = check.length();
				}
				if (check.equals("F=T") || check.equals("T=F")) {
					System.out.println("NO");
					yes = false;
					break;
				}
			}
			if (yes) {
				System.out.println("YES");
			}
		}

	}
}