
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inputData = scn.nextLine();
		String searchData = scn.nextLine();
		inputData =inputData + inputData;
		if (inputData.contains(searchData)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

