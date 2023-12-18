import java.util.*;
public class Main {
	static boolean prime[] = new boolean[1000001];
	static List<Integer> hyou = new ArrayList<Integer>();
	static int sum[] = new int[1000001];
	static int doIt(int n){
		int cnt = 0;
		boolean[] a = new boolean[sum.length];
		for(int s=0;s<a.length;s++)a[s]=true;
		for(int s=n-1;s>0;s--){
			if(prime[s]&&prime[n-s]&&a[s]){
				cnt++;
				a[n-s]=false;a[s]=false;
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s]){
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
				hyou.add(s);
			}
		}
		for(int i=0;i<sum.length;i++){
			if(prime[i])sum[i]=1;
			else sum[i]=0;
		}
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0)break;
			System.out.println(doIt(n));
		}
	}
}