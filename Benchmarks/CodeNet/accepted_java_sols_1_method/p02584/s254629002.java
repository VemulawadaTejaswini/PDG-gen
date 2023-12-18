import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = Math.abs(sc.nextLong());
        long K = sc.nextLong();
        long D = sc.nextLong();

        long straight = X/D;
        if(straight >= K) System.out.println(X-K*D);
        else{
            X %= D;
            K -= straight;
            if(K%2==0) System.out.println(X);
            else System.out.println(D-X);
        }

    }
}
