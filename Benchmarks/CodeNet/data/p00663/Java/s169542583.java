import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String exp = sc.nextLine();
			if (exp.equals("#"))
				break;
			String[] clause = exp.split("\\|");
			for (int i = 0; i < clause.length; i++) {
				clause[i] = clause[i].replace("(", "");
				clause[i] = clause[i].replace(")", "");
			}
			// System.out.println(Arrays.toString(clause));
			boolean yes = false;
			for (int i = 0; i < clause.length; i++) {
				String[] tmp = clause[i].split("&");
				boolean flag = true;
				for (int j = 0; j < tmp.length; j++) {
					if (tmp[j].length() == 1) {
						for (int k = 0; k < tmp.length; k++) {
							if (k == j)
								continue;
							if (tmp[k].equals("~" + tmp[j])) {
								j = tmp.length;
								flag = false;
								break;
							}
						}
					}
				}
				if (flag) {
					yes = true;
					break;
				}
			}
			System.out.println(yes ? "yes" : "no");
		}
	}
}