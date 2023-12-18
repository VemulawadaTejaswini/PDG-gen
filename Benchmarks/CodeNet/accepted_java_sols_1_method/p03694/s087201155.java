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
        int N = sc.nextInt();
        int max = 0;
        int min = INF;
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        System.out.println(max-min);
    }

    public static void main(String[] args) {
        new Main();
    }
}
