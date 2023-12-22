import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String all ="abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();

		String[] afterAll = all.split(line1);

		String ans = afterAll[1].substring(0,1);

		System.out.print(ans);
	}
}