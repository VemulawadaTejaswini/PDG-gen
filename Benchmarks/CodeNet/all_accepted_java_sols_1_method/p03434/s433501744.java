import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int alice = 0;
		int bob = 0;
		int j = 0;
		for(int i = n - 1 ; i >= 0 ; i--) {
			if(j % 2 == 0) alice += a[i];
			else bob += a[i];
			j++;
		}
		System.out.println(alice - bob);
	}
}
