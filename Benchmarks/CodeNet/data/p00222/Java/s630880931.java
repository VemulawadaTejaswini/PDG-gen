import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n;
		
		boolean[] primes = new boolean[10000001];
		Arrays.fill(primes, true);
		for(int i = 3; i < 10000000; i += 2){
			primes[i + 1] = false;
			for(int j = 2; j * j <= i; j++){
				if(i % j == 0){
					primes[i] = false;
					break;
				}
			}
		}
		
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
}