import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list,Comparator.reverseOrder());
        int a=0;
        int b = 0;
        for(int i=0;i<N;i++){
            if(i%2==0)a+=list.get(i);
            else b+=list.get(i);
        }
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        new Main();
    }
}
