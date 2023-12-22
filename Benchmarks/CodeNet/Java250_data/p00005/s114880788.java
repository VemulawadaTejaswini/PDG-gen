import java.io.*;
import java.util.*;
import java.math.*;


public class Main
{

public static long GCD(long a, long b){
	if(b == 0) return a;
	else return GCD(b, a%b);
}

public static long LCM(long a, long b){
	return (a * b)/GCD(a, b);
}




 public static void main(String args[]) throws Exception
       {
       	Scanner cin = new Scanner(System.in);
       	while(cin.hasNext()){
       		long a = cin.nextLong();
       		long b = cin.nextLong();
       		//System.out.println(GCD(a, b));
       		System.out.println( GCD(a, b) + " " + LCM(a, b));
       	}

}
}