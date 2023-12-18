
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line_S = sc.nextLine().split("", 0);
		String[] line_T = sc.nextLine().split("", 0);
		int con = 0;
		for (int i = 0; i < line_S.length; i++) {
			if (line_S[i].compareTo(line_T[i]) != 0) {
				con++;
			}
		}
		System.out.println(con);
	}
}
