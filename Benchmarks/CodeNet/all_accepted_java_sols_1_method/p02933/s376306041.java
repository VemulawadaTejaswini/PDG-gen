import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String m = scn.next();
		System.out.println(n>=3200?m:"red");
		scn.close();
	}
}