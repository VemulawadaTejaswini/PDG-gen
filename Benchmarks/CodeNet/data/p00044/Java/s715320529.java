import java.util.*;
public class Main {
	static boolean prime[] = new boolean[200000];

	static int big(int n){
		int result = 0;
		for(int i=n-1;i>0;i--)if(prime[i]){
			result = i;
			break;
		}
		return result;
	}
	static int small(int n){
		int result=0;
		for(int i=n+1;;i++)if(prime[i]){
			result = i;
			break;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s])
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
		}
		while(in.hasNext()){
			int n = in.nextInt();
			System.out.println(big(n)+" "+small(n));
		}
	}
}