import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			int N;
			
			while((line=r.readLine())!=null){
				N = Integer.parseInt(line);
				ArrayList<Integer> primelist = prime(N);
				
				int count=0;
				
				for(int i=1;i<N;i++){
					if(primelist.contains(i) && primelist.contains(N-i+1)){
						count++;
					}
				}
				
				System.out.println(count);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Sieve of Eratosthenes
	public static ArrayList<Integer> prime(int n){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		Boolean[] p = new Boolean[n+1];
		int i;
		for(i=2;i<=Math.sqrt(n);i++){
			if(!p[i]){
				primes.add(i);
				//exclude multiples
				for(int j=2;i*j<=n;j++){
					p[i*j] = true;
				}
				continue;
			}
		}
		
		for(;i<=n;i++){
			if(!p[i]){
				primes.add(i);
			}
		}
		
		return primes;
	}
	
}