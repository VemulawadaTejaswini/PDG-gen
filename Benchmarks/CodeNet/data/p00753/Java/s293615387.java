import java.util.*;
import java.math.BigInteger;
class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n > 0){
	    int count = 0;
	    for(int i=n;i<2*n;i++){
	        boolean isPrime = BigInteger.valueOf(i).isProbablePrime(100);
		if(isPrime) count++;
	    }
	    System.out.println(count);
	    n = sc.nextInt();
	}
    }
}