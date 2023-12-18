import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
			while(true){
				String bString=in.readLine();
				if(bString.length()==0||bString==null||bString=="") break;
				int xiao_case=Integer.valueOf(bString);
				printPrimes(xiao_case);
			}
    	
	}

public static void printPrimes(int n){
    	int c=0;
    	if ( n <= 1)
    	return;
    	int all[] = new int[n+1];
    	for (int i = 0; i <= n; i++){
    	all[i] = i;
    	}

    	int prime[] = new int[n+1];
    	for (int i = 0; i <= n; i++)
    	prime[i] = 1;

    	int x = 2;
    	while (x <= n){
    	if (prime[x] == 1){
    	   if(checkPrime(n-x+1)) c++;
    	   for (int j = 1; j * x <=n; j++)
    	      prime[j*x] = 0;
    	}
    	x++;
    	}
    	System.out.println(c);
    } 
    public static boolean checkPrime(int n){
    	 if(n < 2) return false;
    	    if(n == 2 || n == 3) return true;
    	    if(n%2 == 0 || n%3 == 0) return false;
    	    long sqrtN = (long)Math.sqrt(n)+1;
    	    for(long i = 6L; i <= sqrtN; i += 6) {
    	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    	    }
    	    return true;
    }
}