import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long ans = 0;
		long now = a[0];
		for(int i = 1; i < n; i++) {
			if(now > a[i]) {
				ans+=(now-a[i]);
			}else {
				now = a[i];
			}
		}
		
		System.out.println(ans);
	}
	
}

