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
        long ans = 1;
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            ans*=i;
            ans%=MOD;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
