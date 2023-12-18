
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = (N + 999) / 1000;
		int r = M * 1000 - N;
		System.out.println(r);
	}
}
