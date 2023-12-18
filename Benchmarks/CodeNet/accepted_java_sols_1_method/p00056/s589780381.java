import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean prime[] = new boolean[50001];
		for(int i=0;i<prime.length;i++)prime[i]=true;
		prime[0]=false;prime[1]=false;
		for(int s=0;s<prime.length;s++){
			if(prime[s])
				for(int i=s+s;i<prime.length;i+=s)prime[i]=false;
		}
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0)break;
			int cnt = 0;
			boolean sw[] = new boolean[prime.length];
			for(int i=0;i<sw.length;i++)sw[i]=true;
			for(int s=0;s<n;s++){
				if(prime[s]&&prime[n-s]&&sw[s]){
					cnt++;
					sw[s]=false;
					sw[n-s]=false;
				}
			}
			System.out.println(cnt);
		}
	}
}