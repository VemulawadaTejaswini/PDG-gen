import java.math.BigInteger;
import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a[] = new BigInteger[n];
        BigInteger stool = BigInteger.ZERO;
        for(int i=0;i<n;i++)
            a[i] = sc.nextBigInteger();

        for(int i=1;i<n;i++){
        	if(a[i].compareTo(a[i-1])==-1){
        		BigInteger x = (a[i-1].subtract(a[i]));
        		stool = stool.add(x);
        		a[i] = a[i-1];
        	}
        }
        System.out.println(stool);

  	}
}

