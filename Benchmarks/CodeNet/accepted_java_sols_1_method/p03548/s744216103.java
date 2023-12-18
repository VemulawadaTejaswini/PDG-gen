import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine();
		String[] inArray = in1.split(" ");

		int isu = Integer.parseInt(inArray[0]);
		int hito = Integer.parseInt(inArray[1]);
		int haba = Integer.parseInt(inArray[2]);

		int start = isu - haba;
		int ans = start / (hito + haba);

		System.out.println(ans);

	}


}