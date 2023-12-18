import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String[] line = new String[3001];

		for (int i = 0; i < line.length; i++) {
			line[i] = sc.nextLine();

			if (line[i].equals("0 0")) {
				break;
			}
		}
		for (int i = 0; i < line.length; i++) {

			if (line[i].equals("0 0")) {
				break;
			}
			String[] lined = line[i].split(" ");
			int v = Integer.parseInt(lined[0]);
			int v2 = Integer.parseInt(lined[1]);
			if (v > v2) {
				System.out.println(v2 + " " + v);
			} else {
				System.out.println(v + " " + v2);
			}
		}
	}

}