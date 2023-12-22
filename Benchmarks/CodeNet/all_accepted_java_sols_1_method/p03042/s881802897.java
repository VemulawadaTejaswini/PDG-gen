import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String s = sc.next();

		sc.close();

		final String s1 = s.substring(0, 2);
		final String s2 = s.substring(2);

		final List<String> mmList = new ArrayList<>(Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"));

		if (!mmList.contains(s1) && !mmList.contains(s2)) {
			System.out.print("NA");
			return;
		}
		if (mmList.contains(s1) && mmList.contains(s2)) {
			System.out.print("AMBIGUOUS");
			return;
		}
		if (mmList.contains(s2)) {
			System.out.print("YYMM");
			return;
		}
		if (mmList.contains(s1)) {
			System.out.print("MMYY");
			return;
		}

	}

}
