import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] isPrime=new boolean[100000*2+100];
	static{
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j=i+i;j<isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			if(N==0)break;
			int ans=0;
			for(int i=N+1;i<=N+N;i++){
				if(isPrime[i])ans++;
			}
			System.out.println(ans);
		}

	}

}