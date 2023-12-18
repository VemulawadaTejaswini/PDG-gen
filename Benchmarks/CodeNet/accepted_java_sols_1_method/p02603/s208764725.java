import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int[] A = new int[N];
	for(int i = 0; i < N; i++){
		A[i] = s.nextInt();
	}

    long wallet = 1000;
	for(int i = 1; i < N; i++){
		if(A[i-1] < A[i]){
			wallet = wallet%A[i-1] + A[i]*(wallet/A[i-1]);
		}
	}
	System.out.println(wallet);
    
  }
}