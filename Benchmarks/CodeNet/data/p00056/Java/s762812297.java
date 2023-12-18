import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		ArrayList<Integer> primes = new ArrayList<Integer>(); 
		String string;
		int prime, count;
		
		for(int i = 2; i < 50000; i++){
			boolean judge = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					judge = false;
					break;
				}
			}
			if(judge) primes.add(i);
		}
		
		while(!(string = reader.readLine()).equals("0")){
			prime = Integer.parseInt(string);
			count = 0;
			
			for(int i = 0; i < primes.size(); i++){
				int a = primes.get(i);
				if(a >= prime) break;
				for(int j = i; j < primes.size(); j++){
					int b = primes.get(j);
					if(a + b > prime) break;
					if(a + b == prime) count++;
				}
			}
			System.out.println(count);
		}
		reader.close();
	}
}