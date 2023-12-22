import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] L = new int[n];
		for(int i = 0;i < n;i ++) {
			L[i] = sc.nextInt();	
		}
		Arrays.sort(L);
		int sum = 0;
		for(int i = 0;i < n - 1;i ++) {
			sum += L[i];
		}
		if(L[L.length - 1] < sum) System.out.println("Yes");
		else System.out.println("No");
	}
}