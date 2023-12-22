import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n+2];
		for(int i=0;i<m;i++) {
			a[in.nextInt()]++;
			a[in.nextInt()+1]--;
		}
		for(int i=1;i<=n;i++) {
			a[i] += a[i-1];
		}
		int ans = 0;
		for(int i=0;i<=n;i++) {
			if(a[i]==m) ans++;
		}
		System.out.println(ans);
		in.close();
	}

}
