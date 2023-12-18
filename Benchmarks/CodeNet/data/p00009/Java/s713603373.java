import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean[] isprime;
	int[] prime;
	void run(){
		prime =new int[1000000];
		isprime = new boolean[1000000];
		for(int i = 2; i < 1000000;i++ )
			isprime[i] = true;
		for(int i = 2; i < 1000000;i++ ){
			if(!isprime[i])
				continue;
			for(int j = i+i;j < 1000000;j+=i){
				isprime[j] = false;
			}
		}
		int count = 0;
		for(int i = 0;i < 1000000;i++){
			if(isprime[i]) count++;
			prime[i] = count;
		}
		
		for(;;){
			if(!sc.hasNextInt())break;
			int n = sc.nextInt();
			System.out.println(prime[n]);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}