import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		blood_groups();
	}

	private static void blood_groups() {
		int[] bg = new int[4];

		while (sc.hasNext()) {
			String[] datas = sc.nextLine().split(",");

			switch( datas[1] ) {
			case "A":
				bg[0]++;
				break;
			case "B":
				bg[1]++;
				break;
			case "AB":
				bg[2]++;
				break;
			case "O":
				bg[3]++;
				break;
			default:
				break;
			}
		}

		System.out.println(bg[0]);
		System.out.println(bg[1]);
		System.out.println(bg[2]);
		System.out.println(bg[3]);

	}

}

