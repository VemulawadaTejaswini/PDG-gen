import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Calling Extraterrestrial Intelligence Again
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int N = 100000;
		boolean[] f = new boolean[N+1];
		Arrays.fill(f, true);
		List<Integer> sieve = new ArrayList<Integer>();
		f[0]=f[1]=false;
		for(int i=2;i<=N;i++)if(f[i]){
			sieve.add(i);
			for(int j=i+i;j<=N;j+=i)f[j]=false;
		}
		int n = sieve.size();
		for(;;){
			int m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
			if((m|a|b)==0)break;
			int max = 0, P = 0, Q = 0;
			for(int ip=0;ip<n;ip++){
				int p = sieve.get(ip);
				if(m<p)break;
				for(int iq=n-1;iq>=0;iq--){
					int q = sieve.get(iq);
					if(p>q)break;
					if(p*q>m||p*b<q*a)continue;
					if(max<p*q){
						max = p*q; P = p; Q = q;
					}
					break;
				}
			}
			System.out.println(P+" "+Q);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}