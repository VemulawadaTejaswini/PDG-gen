import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dif = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
			dif[i] = sc.nextInt();
		}
		Arrays.sort(dif);
		
		int res= dif[dif.length/2] - dif[dif.length/2 - 1];
		System.out.println(res);
	}
}