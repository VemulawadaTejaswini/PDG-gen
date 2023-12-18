import java.io.*;
import java.util.ArrayList;
public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] numbers = line.split(" ");
			long a = Integer.parseInt(numbers[0]);
			long b = Integer.parseInt(numbers[1]);
			long a2 = a;
			long b2 = b;
			
			
			long limit = Math.min(a, b);
			ArrayList<Long> elements = new ArrayList<Long>();
			
			for (long i = limit; i > 1; i--){
				if (a % i == 0 && b % i == 0){
					a /= i;
					b /= i;
					elements.add(i);  
					continue;
				}
			}
			
			long gcd = 1;
			for(long i : elements){
				gcd *= i;
			}
			
			long lcm = (a2 / gcd) * b2;
			System.out.println(gcd + " " + lcm);
        }
	}
}