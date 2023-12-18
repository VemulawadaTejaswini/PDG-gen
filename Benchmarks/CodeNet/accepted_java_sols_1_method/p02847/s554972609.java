import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int ans = 0;
		switch(str) {
		case "SUN":
			ans = 7;
			break;
		case "MON":
			ans = 6;
			break;
		case "TUE":
			ans = 5;
			break;
		case "WED":
			ans = 4;
			break;
		case "THU":
			ans = 3;
			break;
		case "FRI":
			ans = 2;
			break;
		case "SAT":
			ans = 1;
			break;
			default:
				break;
		}
		System.out.println(ans);
	}

}
