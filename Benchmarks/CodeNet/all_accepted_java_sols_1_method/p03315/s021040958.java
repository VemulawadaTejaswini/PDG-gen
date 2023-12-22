import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int addNum = (int) Arrays.stream(s.split("")).filter(e -> e.equals("+")).count();
		addNum -= (4 - addNum);

		System.out.println(addNum);

		sc.close();
	}
}