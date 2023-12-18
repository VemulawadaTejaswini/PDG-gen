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
        String S = sc.next();
        int a = 0;
        for(int i=0;i<3;i++)a += S.charAt(i)=='A'?1:0;
        int b = 3-a;
        System.out.println(a==0||b==0 ? "No":"Yes");
    }

    public static void main(String[] args) {
        new Main();
    }
}
