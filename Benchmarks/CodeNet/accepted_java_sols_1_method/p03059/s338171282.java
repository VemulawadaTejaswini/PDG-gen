import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
        int b = scn.nextInt();
        int t = scn.nextInt();
        int sum = b * (t / a);
        System.out.println(sum);
	}
}
