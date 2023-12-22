import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int a, d, n;
		
		boolean primes[] = new boolean[1000000];
		primes[0] = primes[1] = true;
		for(int i = 2; i * i < 1000000; i++){
			for(int j = 2; j * i < 1000000; j++){
				primes[i * j] = true;
			}
		}
		
		while(!(string = reader.readLine()).equals("0 0 0")){
			a = Integer.valueOf(string.split(" ")[0]);
			d = Integer.valueOf(string.split(" ")[1]);
			n = Integer.valueOf(string.split(" ")[2]);
			
			for(; n != 0; a += d){
				if(!primes[a]) --n;
			}
			System.out.println(a - d);
		}
		reader.close();
	}
}