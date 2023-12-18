import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n;
		boolean[] primes = new boolean[10001];
		
		for(int i = 2; i < 10001; i++){
			primes[i] = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					primes[i] = false;
					break;
				}
			}
		}
		while((string = reader.readLine()) != null){
			n = Integer.parseInt(string);
			
			int count = 0;
			for(int i = 1; i <= n; i++){
				if(primes[i] && primes[n - i + 1]){
					count++;
				}
			}
			System.out.println(count);
		}
		reader.close();
	}
}