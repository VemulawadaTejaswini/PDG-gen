import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int ans=n/2+n%2;
      System.out.println(ans);
	}
}
