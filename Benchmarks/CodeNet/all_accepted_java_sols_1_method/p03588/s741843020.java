import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int amax=0;
		int bmin=1000000000;
		for(i=0; i < n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			if(a[i]>amax)amax=a[i];
			if(b[i]<bmin)bmin=b[i];
		}
		sc.close();
		sc = null;
		System.out.println(amax+bmin);
	}
}
