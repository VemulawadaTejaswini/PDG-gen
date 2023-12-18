import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] a = new long[n+1];

		a[1]=1;
		for (int i=2; i<=n; i++){

			a[i]++;

			for (int j=i; j<=n; j+=i){
				a[j]++;
			}
		}
		long ans=0;

		for (int i=1; i<=n; i++){
			ans += i * a[i];
		}
		System.out.println(ans);
	}

}