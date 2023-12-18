import java.util.*;

public class Main{
    private static final int mx = 10000000;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n;
	boolean[] prime = (new boolean[mx]);
	Arrays.fill(prime, true);
	prime[0] = prime[1] = false;

	for(int i = 2; i < mx; ++i)
	    if(prime[i])
		for(int j = i+i; j < mx; j+=i)
		    prime[j] = false;
	
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n == 0) break;

	    for(int i = n; i >= 13; --i)
		if(prime[i-8] && prime[i-6] && prime[i-2] && prime[i]){
		    System.out.println(i);
		    break;
		}
	}
    }
}