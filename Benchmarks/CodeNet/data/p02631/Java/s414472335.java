import java.io.PrintWriter;
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
        PrintWriter pw = new PrintWriter(System.out);
        long ans = 0;
        int N = sc.nextInt();
        int[] A = new int[N];
        int xor = 0;
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            xor ^= A[i];
        }
        for(int i=0;i<N;i++){
            pw.print(xor^A[i]);
            pw.print(" ");

        }
        pw.println();
        pw.flush();;
    }

    public static void main(String[] args) {
        new Main();
    }
}
