import java.util.Scanner;

public class Main {
	static int prime[] = new int [999999];
	static boolean is_prime[] = new boolean[1000000];
	static int sieve(int n){
		int p = 0;
		for(int i = 0;i <= n; i++) is_prime[i] = true;
		is_prime[0] =  false;
		is_prime[1] = false;
		for(int i = 2;i <= n;i++){
			if(is_prime[i]){
				prime[p++] = i;
				for(int j = 2*i;j <= n;j += i) is_prime[j] = false;
			}
		}
		return p;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			try{
				int N = in.nextInt();
	            System.out.println(sieve(N));
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}