import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ss = line.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		int c = Integer.parseInt(ss[2]);
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}