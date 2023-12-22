import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		int num = -1;

		switch (day) {
		case "SUN":
			num = 0;
			break;
		case "MON":
			num = 1;
			break;
		case "TUE":
			num = 2;
			break;
		case "WED":
			num = 3;
			break;
		case "THU":
			num = 4;
			break;
		case "FRI":
			num = 5;
			break;
		case "SAT":
			num = 6;
			break;
		}
		if (num == 0) {
			System.out.println(7);
		} else {
			int cnt = num;
			while (cnt % 7 != 0) {
				cnt++;
			}
			num = cnt - num;
			System.out.println(num);
		}
	}
}