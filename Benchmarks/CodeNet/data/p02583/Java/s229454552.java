import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		
		Arrays.sort(l);
		int ans = 0;
		for(int i = 2; i < n; i++) {
			int b = l[i];
			for(int is = 0; is <= i; is++) {
				int a = l[is];
				for(int il = i; il < n; il++) {
					int c = l[il];
					if(a != b && b != c && c != a) {
						if(b > c - a && b < a + c) {
							ans++;
						}
					}
				}
			}
			
		}
		System.out.println(ans);
		
		sc.close();
	}
}
