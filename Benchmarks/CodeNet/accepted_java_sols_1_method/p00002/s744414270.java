import java.util.*;
import java.util.Scanner ; 
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger a,b,r;
        Scanner sc = new Scanner(System.in);
        String s;
        while(sc.hasNextBigInteger()){
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            r = a.add(b);
            s = r.toString();
            System.out.println(s.length());
        }  
    }
}