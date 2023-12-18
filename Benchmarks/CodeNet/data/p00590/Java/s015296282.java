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
				int count=0;
				if(N>2){
					ArrayList<Integer> primelist = prime(N);
					for(int i : primelist){
						if(primelist.contains(i) && primelist.contains(N-i+1)){
							count++;
						}
					}
				}
				System.out.println(count);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Sieve of Eratosthenes
	public static ArrayList<Integer> primes(int n){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		//initialize number list (add all numbers from 2 to n)
		for(int i=2;i<=n;i++){
			numbers.add(i);
		}
		
		int limit = (int)Math.sqrt(n);
		
		while(true){
			int k = numbers.get(0);
			if(k>limit){
				break;
			}
			primes.add(k);
			numbers.remove(Integer.valueOf(k));
			for(int j=2;k*j<=n;j++){
				numbers.remove(Integer.valueOf(k*j));
			}
		}
		for(int i : numbers){
			primes.add(i);
		}
		
		return primes;
	}
	

	public static ArrayList<Integer> prime(int n){
		ArrayList<Integer> primes = new ArrayList<Integer>();

		int i;
		Boolean[] p = new Boolean[n+1];
		//initialize number list
		for(i=1;i<=n;i++){
			p[i] = true;
		}
		
		
		int limit = (int)Math.sqrt(n);
		
		for(i=2;i<=limit;i++){
			if(p[i]){
				primes.add(i);
				for(int j=2;i*j<=n;j++){
					p[i*j] = false;
				}
				continue;
			}
		}
		
		for(;i<=n;i++){
			if(p[i]){
				primes.add(i);
			}
		}
		
		return primes;
	}
}