import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		String str;

		switch(D) {
		case 25:
			str = "Christmas";
			break;
		case 24:
			str = "Christmas Eve";
			break;
		case 23:
			str = "Christmas Eve Eve";
			break;
		case 22:
			str = "Christmas Eve Eve Eve";
			break;
		default:
			str = "";
		}

		System.out.println(str);

	}
}