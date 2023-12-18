import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static boolean[] isPrime = new boolean[1000000];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		fill_isPrime();
		while(sc.hasNext()){
			System.out.println(theNumberOfPrime(sc.nextInt()));
		}
	}
	private static int theNumberOfPrime(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(isPrime[i]) count++;
		}
		return count;
	}
	private static void fill_isPrime(){
		Arrays.fill(isPrime, true);
		isPrime[1]=false;
		isPrime[2]=true;
		for(int i=1;i<=999999;i++){
			if(isPrime[i]){
				for(int j=i*2;j<=999999;j=j+i){
					isPrime[j] = false;
				}
			}
		}
	}
}