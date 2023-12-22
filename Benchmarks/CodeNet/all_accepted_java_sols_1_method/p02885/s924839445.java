import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int windowWidth = sc.nextInt();
		int curtainWidth = sc.nextInt();

		int culc = windowWidth - (curtainWidth * 2);
		int ans = Math.max(culc, 0);

		System.out.print(ans);
		sc.close();
	}
}
