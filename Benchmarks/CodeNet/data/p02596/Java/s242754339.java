import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int K = s.nextInt();
	
	BigInteger Knum = new BigInteger(String.valueOf(K));
	BigInteger sevens = new BigInteger(String.valueOf(7));
	if(K%2 == 0){
		System.out.println(-1);
	}else{
		int count = 1; 
		while(!sevens.mod(Knum).equals(BigInteger.ZERO)){
			count++;
			sevens = sevens.multiply(new BigInteger("10"));
			sevens = sevens.add(new BigInteger("7"));
		}
		System.out.println(count);
	}
    
  }
}