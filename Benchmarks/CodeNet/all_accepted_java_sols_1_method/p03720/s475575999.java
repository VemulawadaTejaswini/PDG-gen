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

    Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] set = new int[n];
        for(int i=0;i<m;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            set[a]++;
            set[b]++;
        }
        for(int i=0;i<n;i++){
            System.out.println(set[i]);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
