import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> data = new ArrayList<Integer>();
		String line;
		
		while((line = in.readLine()) != null){
			int n = Integer.parseInt(line);
			if(n==0) break;
			data.add(n);
		}
		
		int max = -1;
		for(int i=0; i<data.size(); i++){
			if(max < data.get(i)){
				max = data.get(i);
			}
		}
		
		int[] primes = get_prime(max);
		for(int i=0; i<data.size(); i++){
			int n = data.get(i);
			for(int j=n; j>=5; j--){
				if(primes[j]==1 && primes[j-2]==1){
					System.out.println(Integer.toString(j-2) + " " + Integer.toString(j));
					break;
				}
			}
		}
	}
	
	public int[] get_prime(int max){
		int[] prime = new int[max+1];
		for(int i=2; i<=max; i++){
			int is_prime = 0;
			for(int j=2; j<=i/2; j++){
				if(prime[j]==1){
					if(i%j==0){
						is_prime = 1;
						break;
					}
				}
			}
			if(is_prime==0){
				prime[i]=1;
			}
		}
		
		return prime;
	}
}