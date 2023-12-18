import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		while((s=br.readLine())!=null)
		{
		    int n = Integer.valueOf(s);
  		    System.out.println(numOfPrimes(n));
		}
	}
	
	private static int numOfPrimes(int n)
	{
	    if(n<2)  return 0;
	    if(n==2) return 1;
	    if(n==3) return 2;

	    int i=4;
	    ArrayList<Integer> primes = new ArrayList<Integer>();
	    primes.add(2);
	    primes.add(3);

	    while(i <= n)
	    {
		if(i%2==0) { 
		} else if(i%3==0) {
		} else {
	            boolean found = true;
		    int size = primes.size();
		    for(int j=0; j<size; j++){
			// confirms whether square i has been checked
			int i2 = primes.get(j) * primes.get(j);
			if(i < i2) break;
			// finds i isn't a prime num
			if(i%primes.get(j)==0) {
				found = false;
				break;
			}
		    }
		    if(found) primes.add(i);
		}
		i++;
	    }
	    return primes.size();
	}
}