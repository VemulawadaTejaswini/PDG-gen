import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner (new BufferedInputStream(System.in));
        int n=cin.nextInt();
        BigInteger ans = BigInteger.valueOf(1);
        boolean ok=true;
        BigInteger k = new BigInteger("1000000000000000000");
        for(int i=1;i<=n;i++){
        	BigInteger j=cin.nextBigInteger();
        	ans=ans.multiply(j);
        }
        if(ans.compareTo(k)==1) ok=false;
        if(ok==true) System.out.println(ans);
        else System.out.println(-1);
    }
}