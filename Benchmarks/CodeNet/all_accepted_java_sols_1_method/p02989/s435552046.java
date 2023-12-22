import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
	Arrays.sort(a);

	int me=-1+n/2;

System.out.println(a[me+1]-a[me]);
	}}