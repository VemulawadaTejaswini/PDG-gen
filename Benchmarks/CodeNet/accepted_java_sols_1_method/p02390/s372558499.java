import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = Integer.parseInt(scan.nextLine());
		int h = S / (60 * 60);
		int m = (S - (h * 60 * 60)) / 60;
		int s = S - (h * 60 * 60) - (m * 60);
		System.out.println(h + ":" + m + ":" + s);
	}

}

