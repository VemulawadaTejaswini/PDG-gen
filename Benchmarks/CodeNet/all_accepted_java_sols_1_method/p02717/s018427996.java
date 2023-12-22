import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		Arrays.setAll(n, i -> sc.nextInt());
		System.out.println(n[2] + " " + n[0] + " " + n[1]);
		
	}
}
