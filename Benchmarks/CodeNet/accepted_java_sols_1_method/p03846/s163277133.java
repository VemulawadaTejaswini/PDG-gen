import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		long m = (long)Math.pow(10,9)+7;

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(sc.next())] += 1;
		}

		if (n%2==0){
			for (int i = 0; i < n; i++) {
				if ((i%2== 1 && a[i] != 2) || (i%2== 0 && a[i] != 0)){
					System.out.println(0);
					return;
				}
			}
			int ans = 1;
			for (int i=0; i<n/2; i++){
				ans *= 2;
				ans %= m;
			}
			System.out.println(ans);


		}else {
			if (a[0] != 1){
				System.out.println(0);
				return;
			}
			for (int i = 1; i < n; i++) {
				if ((i%2== 0 && a[i] != 2) || (i%2== 1 && a[i] != 0)){
					System.out.println(0);
					return;
				}
			}
			int ans = 1;
			for (int i=0; i<(n-1)/2; i++){
				ans *= 2;
				ans %= m;
			}
			System.out.println(ans);
		}
	}
}
