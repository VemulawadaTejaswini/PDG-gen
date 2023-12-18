
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}
    static int n = 0;
    static int s = 0;
    static int currentans =0;

    public static void main(String[] args){
	// write your code here
        Scanner sc=new Scanner(System.in);
       System.out.println((int)Math.pow(sc.nextInt(),3));
    }
}

