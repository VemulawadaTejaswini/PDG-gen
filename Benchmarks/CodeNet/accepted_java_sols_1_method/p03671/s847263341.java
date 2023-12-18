import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] x = {a, b, c};
		
		Arrays.sort(x);
		
		System.out.println(x[0] + x[1]);
		
	}
}
