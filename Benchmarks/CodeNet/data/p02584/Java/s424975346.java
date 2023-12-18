import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	long X = s.nextLong();
	long K = s.nextLong();
	long D = s.nextLong();
	
	if(X/D < K){
		if((K-X/D)%2 == 0){
			System.out.println(Math.abs(X)%D);
		}else{
			System.out.println(Math.abs(Math.abs(X)%D-D));
		}
	}else{
		System.out.println(Math.abs(X)-D*K);
	}

	



    
  }
}