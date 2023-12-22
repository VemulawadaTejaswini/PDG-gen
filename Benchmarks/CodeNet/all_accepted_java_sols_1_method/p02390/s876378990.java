import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int S = Integer.parseInt(line);
		int h = S / 3600;
		int m = (S - h*3600) / 60;
		int s = S - h * 3600 - m * 60;
		System.out.println(h + ":" + m + ":" + s);
	}

}