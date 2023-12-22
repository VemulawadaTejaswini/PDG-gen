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
        long ans = INF;
        int N = sc.nextInt();
        int[] X = new int[N];
        for(int i=0;i<N;i++){
            X[i]=sc.nextInt();
        }
        for(int k=0;k<=100;k++){
            int tmp=0;
            for(int i=0;i<N;i++){
                tmp+=(X[i]-k)*(X[i]-k);
            }
            ans=Math.min(ans,tmp);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
