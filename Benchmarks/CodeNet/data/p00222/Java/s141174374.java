import java.util.*;
public class Main {
	static int hantei(int n){
		for(int s=n;s>=13;s--){
			if(prime[s]&&prime[s-2]&&prime[s-6]&&prime[s-8])return s;
		}
		return 0;
	}
	static boolean prime[] = new boolean[10000001];
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s])for(int i=s*2;i<prime.length;i+=s){
				prime[i]=false;
			}
		}
		while(in.hasNext()){
			int n=in.nextInt();
			if(n==0)return;
			System.out.println(hantei(n));
		}
	}
}