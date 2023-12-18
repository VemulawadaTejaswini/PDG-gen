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
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            //A[i] = (int)(Math.random()*200);
            A[i] = sc.nextInt();
        boolean[] up = new boolean[N];
        boolean allup = true;
        for (int i = 1; i < N; i++) {
            up[i - 1] = A[i - 1] < A[i];
            allup &= up[i-1];
        }
        /*
        if(allup){
            System.out.println("1000");
            return;
        }*/

        //System.err.println(Arrays.toString(A));
        //System.err.println(Arrays.toString(up));
        long sum = 1000;
        long buy = 0;
        for (int i = 0; i < N; i++) {
            if (up[i]) {
                long p = sum/A[i];
                buy += p;
                sum -= A[i]*p;
               // System.err.println("buy "+A[i]+"   "+sum);
            } else {
                sum += A[i] * buy;
                buy = 0;
                //System.err.println("sell "+A[i]+"   "+sum);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Main();
    }
}
