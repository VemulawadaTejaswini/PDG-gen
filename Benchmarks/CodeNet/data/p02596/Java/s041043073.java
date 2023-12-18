import java.io.*;
import java.math.BigInteger;
import java.math.*;
import java.util.*;
public class Main {
    public static void main(String args[])throws Exception{
    Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        BigInteger seq = new BigInteger("7");
        int count = 0;
        if(N%2==0 || N%5==0){
            System.out.println("-1");
        }
        
        else{
            while(!seq.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)){
                count++;
                seq = (seq.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(7));
                if(count>1000007) {
                    count = -1;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}