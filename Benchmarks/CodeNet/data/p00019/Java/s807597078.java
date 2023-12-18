import java.io.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    BigInteger sum= BigInteger.valueOf(1);
	    int n = Integer.valueOf(sc.readLine());
	    for(int i=2; i<=n; i++)
		sum = sum.multiply(BigInteger.valueOf(i));
	    System.out.println(sum);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}