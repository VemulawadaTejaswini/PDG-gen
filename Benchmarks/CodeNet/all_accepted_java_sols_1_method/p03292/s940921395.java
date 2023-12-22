import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt(), m = scn.nextInt(), o = scn.nextInt();
		int min = Math.min(Math.min(n,m),o);
		int max = Math.max(Math.max(n, m), o);
		System.out.println(max-min + "\n");
		scn.close();
	}
}
