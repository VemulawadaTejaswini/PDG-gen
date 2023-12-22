import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		List<String> klist = new ArrayList<String>();
		int i = 0;
		for (int j = 0; i < 1; j++) {
			String line = sc.nextLine();
			klist.add(line);
			if (klist.get(j).equals("0 0")) {
				break;
			}
		}
		for (String string : klist) {
			if (string.equals("0 0")) {
				break;
			}
			String[] k = string.split(" ");
			int v = Integer.parseInt(k[0]);
			int v2 = Integer.parseInt(k[1]);
			i = 0;

			for (int j = 0; j < v; j++) {
				i = 0;
				while (i < v2) {
					System.out.print("#");
					i++;
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}