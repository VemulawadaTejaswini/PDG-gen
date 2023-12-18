import java.util.*;
public class Main {
	static boolean prime[] = new boolean[200000];
	static int[] result = new int[10002];
	static void Do(int k){
		int sum=0;
		for(int i=1;i<=k;i++){
			sum+=P(i);
		}
	}
	static int P(int n){
		int cnt=0;
		for(int i=0;i<prime.length;i++){
			if(prime[i]){
				cnt++;
				if(cnt==n)return i;
			}
		}
		return 0;
	}
	
	static void doIt(int n){
		if(n==0)return;
		result[n]=result[n-1]+P(n);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s])
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
		}
		for(int i=1;i<result.length;i++)doIt(i);
		while(in.hasNext()){
			int x = in.nextInt();
			if(x==0)break;
			System.out.println(result[x]);
		}
	}
}