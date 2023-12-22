import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}

    public static void main(String[] args){
	// write your code here
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong(),y=sc.nextLong();
        System.out.println(gcd(x,y));
    }
}

