
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        BigInteger A[] = new BigInteger[N];
        for(int i= 0; i < N; i++) {
            A[i] = new BigInteger(String.valueOf(sc.nextInt()));
        }
        BigInteger allGcd = A[0];
        for(int i = 1; i < N; i++) {
            allGcd = allGcd.gcd(A[i]);
        }
        if(allGcd.intValue() == 1) {
            BigInteger allLcm = A[0];
            BigInteger allMult = A[0];
            for(int i = 1; i < N; i++) {
                allLcm = lcm(allLcm, A[i]);
                allMult = allMult.multiply(A[i]);
            }
            if(allLcm.compareTo(allMult) == 0)
                os.println("pairwise coprime");
            else
                os.println("setwise coprime");
        } else {
            os.println("not coprime");
        }


    }

    static public BigInteger lcm(BigInteger a, BigInteger b) {
        if(a.compareTo(b) == 0)
            return a;

        BigInteger answer =  a.multiply(b.divide(a.gcd(b)));
        return answer;
    }

    static public long gcd(long a, long b) {
        while(a > 0) {
            long tmpa = a;
            a = b % a;
            b = tmpa;
        }
        return b;
    }

}