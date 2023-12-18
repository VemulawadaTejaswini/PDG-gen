import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main byakko = new Main();
		String string;
		int n;
		
		boolean[] primes = byakko.primeSieve();
				
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.parseInt(string);
			
			for(int i = n; i > 0; i--){
				if(primes[i] && primes[i - 2] && primes[i - 6] && primes[i - 8]){
					System.out.println(i);
					break;
				}
			}
		}
		reader.close();
	}
	
	public boolean[] primeSieve(){
		boolean[] primes = new boolean[10000001];
		Arrays.fill(primes, true);
		
		primes[0] = primes[1] = false;
		for(int i = 2; i * i <= 10000000; i++){
			for(int j = 2; i * j  <= 10000000; j++){
				if(!primes[i * j]) continue;
				primes[i * j] = false;
			}
		}
		
		return primes;
	}
	
}