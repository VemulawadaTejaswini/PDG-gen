import java.util.Scanner;

public class Main{
	static int gcd(int m, int n) {
		if(m<n)	return gcd(n, m);
		if(n==0)	return m;
		return gcd(n, m%n);
	}
	static int lcm(int m, int n) {
		return m*n/gcd(m, n);
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a= new int[N+1];
        for(int i=0; i<N; i++) {
        	a[i]=sc.nextInt();
        }
        
        int MAX, MIN, sum=0;
        for(int i=0; i<lcm(N, M); i=i+M) {
        	MAX=0; MIN=110;
        	for(int j=i; j<i+M; j++) {
        		MAX=Math.max(MAX, a[j%N]);
        		MIN=Math.min(MIN, a[j%N]);
        	}
        	sum+=MAX-MIN;
        }
        System.out.println(sum);
	}
}
