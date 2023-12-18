import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PrimeNumberGenerator pg = new PrimeNumberGenerator();
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int p = Integer.parseInt(tmpArray[1]);
			
			if(n == -1 && p == -1){
				break;
			}
			
			int primes[] = pg.primeOverN(n, 20);
			
			int[] sum = sumOfPrimes(primes);
//			for(int i = 0; i < sum.length ; i++){
//				System.out.print(sum[i]+" ");
//			}
//			
//			System.out.println();
			
			System.out.println(sum[p - 1]);
			
		}
	}
	
	static int[] sumOfPrimes(int[] primes){
		int n = primes.length;
		int[] result = new int[n*(n + 1)/2];
		
		int index = 0;
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				result[index++] = primes[i] + primes[j];
//				System.out.println("add "+primes[i]+" + " + primes[j]);
			}
		}
		
		Arrays.sort(result);
		return result;
	}

}

class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[10000000];
 
    public PrimeNumberGenerator() {
        //Date from = new Date();
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
 
        for(int i = 3; i <= Math.sqrt( isPrime.length ); i+=2){
            /*
            if(i % 2 == 0){
                isPrime[i] = false;
                continue;
            }
            */
 
            if(isPrime[i] == false){
                continue;
            }
 
            for(int j = i * 2; j <= isPrime.length - 1; j += i){
                isPrime[j] = false;
            }
        }
        //Date to = new Date();
        //System.out.println("init takes "+ (to.getTime() - from.getTime())+ "milli sec");
    }
    
    public int[] primeOverN(int n, int size){
    	int[] result = new int[size];
    	
    	int index = 0;
    	for(int i = n + 1; index != size ; i++ ){
    		if(i != 2 && i % 2 == 0){
    			continue;
    		}
    		if(isPrime[i]){
    			result[index] = i;
    			index++;
    		}
    	}
    	return result;
    }
 
    public boolean isPrime(int index){
        if(index % 2 == 0 && index != 2){
            return false;
        }
        return isPrime[index];
    }
}