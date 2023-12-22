import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<N;i++){
            String s = sc.next();
            list.add(s);
        }
        Collections.sort(list);
        String ans = "";
        for(int i=0;i<N;i++){
            ans+=list.get(i);
        }
        System.out.println(ans);
    }
}
