import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong() - i - 1;
		}
		Arrays.sort(a);
		long b = 0;
		if(n%2==0)b = (a[n/2-1]+a[n/2])/2;
		else b = a[n/2];
		long sum = 0L;
		for(int i=0; i<n; i++){
			sum += Math.abs(a[i]-b);
		}
		System.out.println(sum);
	}
}