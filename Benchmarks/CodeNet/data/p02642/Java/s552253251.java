import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean[] b =new boolean[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = false;
		}
		

		
		java.util.Arrays.parallelSort(a);
		
		/*for(int i = 0; i< n;i++) {
			System.out.println(a[i]);
		}*/
		int ans = 0;
		if(n != 1 && a[0] != a[1]) {
			ans++;
		}
		
		
		
		for(int i = 0; i < n; i++) {
			for(int m = 0; m < i; m++) {
				if(!b[i] && a[i] % a[m] == 0 ||  a[i] == a[i-1] || (i != n-1 && a[i] == a[i+1])) {
					b[i] = true;
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