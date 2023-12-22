import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong(); long K = sc.nextLong(); long sum = 0;      
	      
	    if (K == 0){System.out.println(N*N); System.exit(0);}	      
	    for (int i=1; i<=N; i++) // b
	    	sum += (N/i) * Math.max(0, i-K)  + Math.max(0, (N%i)-K+1);
	    System.out.println(sum); sc.close();
	}
}