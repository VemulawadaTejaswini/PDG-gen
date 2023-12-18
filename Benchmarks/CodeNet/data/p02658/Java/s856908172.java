import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger now = new BigInteger("1");
        BigInteger lim = new BigInteger("1000000000000000000");
        BigInteger zz = new BigInteger("0");
        boolean f = true;
        for(int i=0;i<n;i++){
            BigInteger x = sc.nextBigInteger();
            if(x.compareTo(zz)==0) {
                f = true;
                now = zz;
            }
            if(now.compareTo(lim)!=1){
                now = now.multiply(x);
            }
            else{
                f = false;
            }
        }
        if(f) System.out.println(now);
        else System.out.println(-1);
    }
}
