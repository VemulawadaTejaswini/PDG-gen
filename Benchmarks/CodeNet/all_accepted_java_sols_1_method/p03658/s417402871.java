import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		
		int sum = 0;
		int i = l.length - 1;
		for(int j = 0; j < k; j++) {
			sum += l[i];
			i--;
		}
		System.out.println(sum);
	}

}
