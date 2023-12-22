import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] p = new int[n];
		Arrays.setAll(p, i -> sc.nextInt());
		
		Arrays.sort(p);
		
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += p[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}


