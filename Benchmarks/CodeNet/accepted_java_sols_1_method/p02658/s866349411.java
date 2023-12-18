import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        BigInteger[] A = new BigInteger[N];
        for(int i=0;i<N;i++){
            A[i]= new BigInteger(sc.next());
            if(A[i].equals(BigInteger.ZERO)){
                System.out.println(0);
                return;
            }
        }
        BigInteger big = A[0];
        BigInteger limit = new BigInteger("1000000000000000000");
        for(int i=1;i<N;i++){
            big = big.multiply(A[i]);
            if(big.compareTo(limit)>0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(big);
    }

    public static void main(String[] args) {
        new Main();
    }
}
