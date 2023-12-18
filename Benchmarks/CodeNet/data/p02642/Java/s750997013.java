import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		
		java.util.Arrays.parallelSort(a);
		
		/*for(int i = 0; i< n;i++) {
			System.out.println(a[i]);
		}*/
		int ans = 0;
		if(a[0] != a[1]) {
			ans++;
		}
		
		
		
		for(int i = 1; i < n; i++) {
			for(int m = 0; m < i; m++) {
				if(a[i] % a[m] == 0 ||  a[i] == a[i-1] || (i != n-1 && a[i] == a[i+1])) {
					break;
				}else if(a[m] > a[i] / 2) {
					//System.out.println(a[m]+" "+ a[i]+" "+ a[i] / 2);
					ans++;
					break;
				}else if(m == i -1) {
					ans++;
				}
			}
		}
		
		
		
		System.out.println(ans);
	}
}