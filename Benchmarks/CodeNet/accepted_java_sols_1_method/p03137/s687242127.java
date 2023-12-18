import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		int sa[] = new int[n-1];
		for (int i = 0; i < n-1; i++) {
			sa[i] = x[i+1]-x[i];
		}
Arrays.sort(sa);
//m-1koryaku

int ans=0;
for (int i = 0; i < n-1-(m-1); i++) {
	ans+=sa[i];
}
System.out.println(ans);
	}}