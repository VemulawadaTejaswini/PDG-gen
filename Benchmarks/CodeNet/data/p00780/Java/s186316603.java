import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		boolean isPrime[] = new boolean[1<<15];
		for(int i=2; i*i<(1<<15); i++) isPrime[i] = true;
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i=2; i<(1<<15); i++){
			if(isPrime[i]){
				for(int j=2*i; j<(1<<15); j+=i){
					isPrime[j] = false;
				}
			}
		}
	
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			int cnt=0;
			for(int i=2; i<=n/2; i++){
				if(isPrime[i] && isPrime[n-i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
	
}