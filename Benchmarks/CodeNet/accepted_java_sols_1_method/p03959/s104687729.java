import java.util.Scanner;

public class Main{
	static final int res = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		long ans = 1;

		for(int i=0; i<n; i++){
			t[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++){
			if(i==0){
				if(t[i]>a[i]){
					ans = 0;
					break;
				}
			}else if(i==n-1){
				if(a[i]>t[i]){
					ans = 0;
					break;
				}
			}else{
				if(t[i-1]<t[i] && a[i]==a[i+1]){
					if(a[i]<t[i]){
						ans = 0;
						break;
					}
				}else if(t[i-1]<t[i] && a[i]>a[i+1]){
					if(t[i]!=a[i]){
						ans = 0;
						break;
					}
				}else if(t[i-1]==t[i] && a[i]>a[i+1]){
					if(t[i]<a[i]){
						ans = 0;
						break;
					}
				}else{
					ans *= (Math.min(t[i], a[i])%res);
					ans %= res;
				}
			}
		}

		System.out.println(ans);
	}
}