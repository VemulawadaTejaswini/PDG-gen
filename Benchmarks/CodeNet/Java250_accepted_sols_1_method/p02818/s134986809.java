import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	long A = s.nextLong();
	long B = s.nextLong();
	long K = s.nextLong();

	if(A >= K){
		A = A - K;
		K = 0;
	}else{
		K = K - A;
		A = 0;
	}

	if(K > 0){
		if(B >= K){
			B = B - K;
			K = 0;
		}else{
			K = 0;
			B = 0;
		}
	}
	
	System.out.println(A + " " + B);

    
  }
}