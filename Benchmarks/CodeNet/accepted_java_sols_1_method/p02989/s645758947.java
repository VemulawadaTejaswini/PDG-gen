import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		
		Arrays.setAll(d, i -> sc.nextInt());
		Arrays.sort(d);
		
		int k = d[n / 2] - d[n / 2 - 1];
		
		System.out.println(k);
		
		sc.close();
	}

}
