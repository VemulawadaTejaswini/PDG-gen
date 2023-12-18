import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> lines = new ArrayList<String>();

		String string = "";
		int cn = 0;
		while (true) {
			string = sc.nextLine();
			lines.add(string);
			cn++;
			if (string.equals("0 0")) {
				break;
			}
		}
		
		String[] kari1 = new String[2];

		for (int i = 0; i < cn; i++) {
			kari1 = lines.get(i).split(" ");
			int[] kari2 = {Integer.parseInt(kari1[0]),Integer.parseInt(kari1[1])};
			Arrays.sort(kari2);
			if (kari2[0] == 0 && kari2[1] == 0) {
				break;
			} else {
				System.out.print(kari2[0]);
				System.out.print(" ");
				System.out.println(kari2[1]);
			}
		}
	}
}