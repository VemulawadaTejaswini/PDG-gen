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
			String str = br.readLine();
			int n = Integer.parseInt(str);
			
			if(n == 0){
				break;
			}
			
			System.out.println(pg.countGoldBach(n));
		}
	}

}

class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[100000001];
    private int[] prime = new int[110000];
 
    public PrimeNumberGenerator() {
        //Date from = new Date();
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
        
        prime[1] = 2;
 
        for(int i = 2; i <= Math.sqrt( isPrime.length ); i++){
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
        
        for(int i = 3, j = 2; i < prime.length ; i++){
        	if(isPrime[i]){
        		prime[j] = i;
        		j++;
        	}
        }
        //Date to = new Date();
        //System.out.println("init takes "+ (to.getTime() - from.getTime())+ "milli sec");
    }
 
    public boolean isPrime(int index){
        if(index % 2 == 0 && index != 2){
            return false;
        }
        return isPrime[index];
    }
    
    public int countGoldBach(int n){
    	int count = 0;
    	
    	for(int i = 2; i <= n/2 ; i++){
    		if(isPrime[i] && isPrime[n - i]){
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    public long sumOfPrime(int n){
    	int sum = 0;
    	for(int i = 1; i <= n; i++){
    		sum += prime[i];
    	}
    	
    	return sum;
    }
}