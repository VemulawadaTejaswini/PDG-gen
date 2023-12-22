import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			t[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		sc.close();

		int[] hmax = new int[n];
		int[] hmin = new int[n];

		boolean alien = false;
		//takahashi
		hmax[0] = t[0];
		hmin[0] = t[0];
		for(int i=1;i<n;i++){
			if(t[i-1]<t[i]){
				hmax[i] = t[i];
				hmin[i] = t[i];
			} else {
				hmax[i] = t[i];
				hmin[i] = 1;
			}
		}
		if(a[n-1]>hmax[n-1]||a[n-1]<hmin[n-1]){
			System.out.println(0);
			return;
		} else {
			hmax[n-1] = a[n-1];
			hmin[n-1] = a[n-1];
		}
		for(int i=n-1;i>=1;i--){
			if(a[i-1]>a[i]){
				if(a[i-1]>hmax[i-1]||a[i-1]<hmin[i-1]){
					System.out.println(0);
					return;
				} else {
					hmax[i-1] = a[i-1];
					hmin[i-1] = a[i-1];
				}
			} else if(hmax[i-1]!=hmin[i-1]){
				hmax[i-1] = Math.min(hmax[i-1], a[i-1]);
			}
		}
		long ans = 1;
//		for(int i=0;i<n;i++){
//			System.out.print(hmax[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<n;i++){
//			System.out.print(hmin[i]+" ");
//		}
//		System.out.println();
		for(int i=0;i<n;i++){
			long sub = (long)(hmax[i]-hmin[i]+1);
			ans *= sub;
			ans %= 1000000007;
		}
		System.out.println(ans);
	}

}