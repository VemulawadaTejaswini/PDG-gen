import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int[] c = new int[10000 + 1];
//		for(int i=0;i<=10000;i++) {
//			c[i] = 0;
//		}
		for(int i=0;i<n;i++) {
			c[a[i]]++;
		}
		for(int i=1;i<=10000;i++) {
			c[i] += c[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			c[a[i]]--;
			b[c[a[i]]] = a[i];
		}
		StringBuilder ans = new StringBuilder();
		ans.append(b[0]);
		for(int i=1;i<n;i++) {
			ans.append(" ").append(b[i]);
		}
		System.out.println(ans);
	}
	
}
