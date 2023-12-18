import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean dp[] = new boolean[20*2000];	
	static int [] A;
	public static void main(String[] args) {
		int n = sc.nextInt();
		A = new int[n];
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		Arrays.fill(dp, false);
		int q = sc.nextInt();
		rec(0,0,n);
		cout(dp[21]);
		for(int i=0;i<q;i++){
			int m = sc.nextInt();
			if(dp[m]==true){
				cout("yes");
			}else{
				cout("no");
			}
		}
	}
	
	
	public static void rec(int d,int now,int b){
		dp[now] = true;
		if(d==b) return;
		rec(d+1,now,b);
		rec(d+1,now+A[d],b);
	}
	
	
	public static boolean isPrime(int n){
		for(int i=2;i<=n*n;i++){
			if(n%i==0) return true;
		}
		return false;
	}
	public static int gcd(int a,int b){
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}
	public static void showary(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			System.out.print(ary[i]+" ");
		}
		cout(ary[ary.length-1]);
	}
	public static void cout(String n){
		System.out.println(n);
	}
	
	public static void cout(int n){
		System.out.println(n);
	}
	public static void cout(boolean n){
		if(n==true){
			cout("true");
		}else{
			cout("false");
		}
	}
}