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
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if(n<=2){
			primes.clear();
			return primes;
		}
		
		//initialize number list (add all numbers from 2 to n)
		for(int i=2;i<=n;i++){
			numbers.add(i);
		}
		int limit = (int)Math.sqrt(n);
		while(true){
			int k = numbers.get(0);
			if(k>=limit){
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
	
}