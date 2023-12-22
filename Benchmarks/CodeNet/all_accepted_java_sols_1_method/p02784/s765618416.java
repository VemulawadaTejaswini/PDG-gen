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
        long ans = 0;
        
        int H = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            sum+=A[i];
        }
        System.out.println((sum>=H)?"Yes":"No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
