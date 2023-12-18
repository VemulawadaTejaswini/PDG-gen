import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	private static boolean[] prime=new boolean[1000000];

	private static void createPrimes()
	{
		Arrays.fill(prime,true);
		prime[0]=prime[1]=false;
		for(int i=2;i*i<=prime.length-1;){
			for(int j=i+i;j<prime.length;j+=i){
				prime[j]=false;
			}
			for(int j=i+1;j<=prime.length;j++){
				if(prime[j]){
					i=j;
					break;
				}
			}
		}
	}
	private static int countPrimes(int n)
	{
		int cnt=0;
		for(int i=2;i<=n;i++){
			if(prime[i]){
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args)
	{
		createPrimes();
		int n;
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			n=scan.nextInt();
			System.out.println(countPrimes(n));
		}
		scan.close();
	}
}