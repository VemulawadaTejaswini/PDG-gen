import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {
    static long divCeil(long a, long b){
        return (a+b-1)/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();

        System.out.println(T * divCeil(N, X));
        
    }
}
