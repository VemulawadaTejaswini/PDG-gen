import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int S = Integer.parseInt(line);
		int h = S / 3600;
		int m = S / 60 - h * 60;
		int s = S % 60;

		System.out.println(h + ":" + m + ":" + s);
	}

}