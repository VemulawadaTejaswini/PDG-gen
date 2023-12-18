import java.util.Scanner;

public class No_1000 {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = "";
		String[] lineAry = new String[2];
		while (true) {
			line = sc.nextLine();
			if (line.length() == 0) {
				sc.close();
				break;
			} else {
				lineAry = line.split(" ");
				System.out.println(Integer.parseInt(lineAry[0]) + Integer.parseInt(lineAry[1]));
			}
		}
	}
}