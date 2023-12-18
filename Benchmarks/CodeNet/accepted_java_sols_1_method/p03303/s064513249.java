import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int w = Integer.parseInt(in.nextLine());

		for (int i = 0; i < line.length(); i = i + w) {
			System.out.print(line.charAt(i));
		}
		System.out.println("");
		in.close();
	}

}
