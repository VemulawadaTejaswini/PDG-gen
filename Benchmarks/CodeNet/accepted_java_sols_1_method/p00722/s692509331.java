import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean isPrime[] = new boolean[1000005];
	static{
		Arrays.fill(isPrime,true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j = i+i;j<isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int a =cin.nextInt();
			int d =cin.nextInt();
			int n =cin.nextInt();
			if(a+d+n==0){
				break;
			}
			int count=0;
			for(int i = a;i<isPrime.length;i+=d){
				if(isPrime[i]){
					count++;
				}
				if(count==n){
					System.out.println(i);
					break;
				}
			}
			
			
		}
	}

}