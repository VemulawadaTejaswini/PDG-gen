import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] split = line.split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		String output = null;
		if (a == b) {
			output = "a == b";
		} else if (a > b) {
			output = "a > b";
		} else if (a < b) {
			output = "a < b";
		}
		System.out.println(output);
		sc.close();
	}
}