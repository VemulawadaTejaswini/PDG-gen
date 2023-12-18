import java.util.Arrays;
import java.util.Scanner;

//Farey Sequence
public class Main{

	int[] eulerPhiTable(int n){
		int[] res = new int[n+1];
		boolean[] p = new boolean[n+1];
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(int i=0;i<=n;i++)res[i]=i;
		for(int i=2;i<=n;i++)if(p[i]){
			res[i]-=res[i]/i;
			for(int j=i+i;j<=n;j+=i){
				p[j] = false;
				res[j]-=res[j]/i;
			}
		}
		return res;
	}
	
	void run(){
		int N = 1000000;
		int[] f = eulerPhiTable(N);
		long[] res = new long[N+1];
		res[1] = 2;
		for(int i=2;i<=N;i++)res[i]=res[i-1]+f[i];
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0)System.out.println(res[sc.nextInt()]);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}