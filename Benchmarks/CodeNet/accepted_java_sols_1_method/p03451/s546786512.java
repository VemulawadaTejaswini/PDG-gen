import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line0 = sc.nextLine();
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		List<String> lines1 = Arrays.asList(line1.split(" "));
		List<String> lines2 = Arrays.asList(line2.split(" "));

		int ame = 0;
		int newAme = 0;
		for (int i = 0, o = 0; i < lines1.size(); o++) {
			newAme = newAme + Integer.parseInt(lines1.get(o));
			if (o == i) {
				for (int j = i; j < lines2.size(); j++) {
					newAme = newAme + Integer.parseInt(lines2.get(j));
					if (j == lines2.size() - 1) {
						if (ame < newAme) {
							ame = newAme;
						}
						newAme = 0;
						o = -1;
						i++;
						break;
					}
				}
			}

		}

		System.out.println(ame);
	}

}