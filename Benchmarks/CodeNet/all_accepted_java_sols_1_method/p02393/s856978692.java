import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[3];
		n[0] = sc.nextInt();
		n[1] = sc.nextInt();
		n[2] = sc.nextInt();
		Arrays.sort(n);
		System.out.println(n[0] + " " + n[1] + " " + n[2]);
	}
}
