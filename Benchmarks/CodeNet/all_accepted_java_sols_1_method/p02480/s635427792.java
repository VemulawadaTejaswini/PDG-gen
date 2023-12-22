import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int answer = (int)Math.pow(x, 3);
		System.out.println(answer);
	}
}