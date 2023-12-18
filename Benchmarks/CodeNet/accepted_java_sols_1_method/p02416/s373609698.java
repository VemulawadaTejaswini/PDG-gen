import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		List<String> k = new ArrayList<String>();
		while (true) {
			String line = sc.nextLine();
			k.add(line);
			if (line.equals("0")) {
				break;
			}
		}

		for (String string : k) {
			if (string.equals("0")) {
				break;
			}
			String[] lig = new String[string.length()];
			for (int i = 0; i < string.length(); i++) {
				lig[i] = string.substring(i, i + 1);
			}
			int sum = 0;
			int[] v = new int[lig.length];
			for (int i = 0; i < lig.length; i++) {
				v[i] = Integer.parseInt(lig[i]);
				sum += v[i];
			}
			System.out.println(sum);
		}

	}

}