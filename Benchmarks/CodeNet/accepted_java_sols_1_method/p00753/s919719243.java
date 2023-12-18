import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]){
	boolean isPrime[] = new boolean[1000000];
	for(int i=2;i<=246912;i++){
	    isPrime[i] = true;
	}
	for(int i=2;i<=246912;i++){
	    if(isPrime[i]){
		int n = 2 * i;
		while(n<=246912){
		    isPrime[n] = false;
		    n += i;
		}
	    }
	}

	Scanner in = new Scanner(System.in);
	while( true ){
	    int n = in.nextInt();
	    if( n == 0 ) break;
	    int count = 0;
	    for(int i=n+1;i<=2*n;i++){
		if(isPrime[i]){
		    count++;
		}
	    }
	    System.out.println(count);
	}
    }

}