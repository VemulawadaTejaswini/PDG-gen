import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] ans = new int[3];
		ans[0] = a + b;
		ans[1] = a - b;
		ans[2] = a * b;
		Arrays.sort(ans);
		System.out.println(ans[2]);
	}	
}