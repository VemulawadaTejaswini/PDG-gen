import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static void main(String[] args)  throws IOException
		{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String s;
			List<Integer> primes = new ArrayList<Integer>();
			primes = PrimeList(9999);
			while((s=buf.readLine()) != null){
				int count = 0;
				int num = Integer.parseInt(s);
				for(int k=0; primes.get(k)<num; k++){count++;}
				System.out.println(count);
			}
		}
	
	public static List<Integer> PrimeList(int num){
		List<Integer> prime = new ArrayList<Integer>();
		for(int i=2; i<num; i++){
			boolean check = true;
			for(int j=2; i>j; j++){
				if(i%j == 0){check = false;}
			}
			if(check == true){prime.add(i);}
		}
		return prime;
	}
}