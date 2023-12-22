import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int K = scan.nextInt();
		int P[] = new int[n];
		int a = 0;
		for(int i=0; i<n; i++) {
			P[i] = scan.nextInt();
		}
		Arrays.sort(P);
		for(int i=0; i<K; i++) {
			a = a + P[i];
		}
		System.out.println(a);
	}
}