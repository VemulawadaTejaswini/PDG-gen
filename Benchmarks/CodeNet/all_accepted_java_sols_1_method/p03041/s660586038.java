import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt() - 1;
		char[] c = scn.next().toCharArray();
		c[t] += 'a' - 'A';
		System.out.println(c);
		scn.close();
	}
}
