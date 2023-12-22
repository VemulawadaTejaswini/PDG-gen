import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		long ans = 0;
		long t;

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for(int i=n-1; i>=0; i--){
			t = a[i] + ans;
			if(t % b[i] == 0) continue;
			ans += b[i] - t % b[i];
		}

		System.out.println(ans);
	}
}
