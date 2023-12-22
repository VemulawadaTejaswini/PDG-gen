import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int ans = 0;
		int i = 0;
		while(i < n) {
			if(i == n - 1) {
				ans++;
				break;
			}
			if(a[i] < a[i + 1]) {
				i++;
				while(i + 1 < n) {
					if(a[i] > a[i + 1]) {
						ans++;
						i++;
						break;
					} else {
						i++;
					}
				}
			} else if(a[i] > a[i + 1]) {
				i++;
				while(i + 1 < n) {
					if(a[i] < a[i + 1]) {
						ans++;
						i++;
						break;
					} else {
						i++;
					}
				}
			} else {
				i++;
				continue;
			}
		}
		System.out.println(ans);
	}
}
