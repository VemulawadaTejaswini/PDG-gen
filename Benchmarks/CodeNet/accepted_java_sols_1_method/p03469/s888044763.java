import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String SArray[] = S.split("/");

		SArray[0] = "2018";

		System.out.print(SArray[0] + "/" + SArray[1] + "/" + SArray[2]);
	}

}