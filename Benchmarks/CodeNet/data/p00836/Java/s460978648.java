
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] isPrime;
	static int[] prime,sum;
	static{
		isPrime=new boolean[10001];
		Arrays.fill(isPrime,true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j=i+i;j<isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}int cnt=0;
		for(int i=0;i<100;i++){
//			System.out.println(i+" "+isPrime[i]);
		}
		for(int i=0;i<isPrime.length;i++){
			if(isPrime[i])
				cnt++;
		}
		prime=new int[cnt];
		sum=new int[cnt+1];
		cnt=0;
		for(int i=0;i<isPrime.length;i++){
			if(isPrime[i]){
				prime[cnt++]=i;
				sum[cnt]=sum[cnt-1]+i;
			}
		}
		for(int i=0;i<sum.length;i++){
//			System.out.println(sum[i]);
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int n=cin.nextInt();
			if(n==0)break;
			int ans=0;
			for(int i=0;i<sum.length;i++){
				for(int j=i+1;j<sum.length;j++){
					if(sum[j]-sum[i]==n)
						ans++;
				}
			}
			
			System.out.println(ans);
			
			
		}

	}

}