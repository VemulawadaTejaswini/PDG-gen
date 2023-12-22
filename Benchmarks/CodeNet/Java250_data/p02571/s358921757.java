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
        String S = sc.next();
        String T = sc.next();
        int min = INF;
        for(int i=0;i<S.length()-T.length()+1;i++){
            int cnt = 0;
            for(int j=0;j<T.length();j++){
                if(S.charAt(i+j)!=T.charAt(j))cnt++;
            }
            min = Math.min(min,cnt);
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        new Main();
    }
}
