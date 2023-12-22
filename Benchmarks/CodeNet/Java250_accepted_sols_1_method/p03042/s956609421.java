import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int num = 0;
		String msg = null;

		if (Integer.parseInt(s.substring(0, 2)) < 13 && Integer.parseInt(s.substring(0, 2)) > 0) {
			num++;
		}
		if (Integer.parseInt(s.substring(2, 4)) < 13 && Integer.parseInt(s.substring(2, 4)) > 0) {
			num += 2;
		}

		switch (num) {
		case 0:
			msg = "NA";
			break;
		case 1:
			msg = "MMYY";
			break;
		case 2:
			msg = "YYMM";
			break;
		case 3:
			msg = "AMBIGUOUS";
			break;
		}
		System.out.println(msg);
	}
}