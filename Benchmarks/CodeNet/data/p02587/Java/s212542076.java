
import java.util.Scanner;

public class Main {
    
    private static int N;
    private static String[] Ss;
    private static int[] Cs;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        Ss = new String[N];
        Cs = new int[N];
        
        for (int i = 0; i < N; i++) {
            Ss[i] = sc.next();
            Cs[i] = sc.nextInt();
        }
        
        long min = Long.MAX_VALUE;
        
        // 単体で回文になっているものがあるか調べる
        for (int i = 0; i < N; i++) {
            if (isPalindrome(i, 0, Ss[i].length()) && Cs[i] < min) {
                min = Cs[i];
            }
        }
        
        // 左端と右端の文字列を選び、その場合の最小コストを調べる
        for (int i1 = 0; i1 < N; i1++) {
            for (int i2 = 0; i2 < N; i2++) {
                long cost = cost(i1, 0, Ss[i1].length(), i2, 0, Ss[i2].length());
                if (cost < min - Cs[i1] - Cs[i2]) {
                    min = cost + Cs[i1] + Cs[i2];
                }
            }
        }
        
        System.out.println(min == Long.MAX_VALUE ? -1 : min);
    }
    
    private static boolean isPalindrome(int i, int s, int e) {
        int ss = s;
        int ee = e - 1;
        while (ss < ee) {
            if (Ss[i].charAt(ss) != Ss[i].charAt(ee)) {
                return false;
            }
            ss++;
            ee--;
        }
        return true;
    }
    
    private static boolean isSameEdge(int i1, int s1, int e1, int i2, int s2, int e2) {
        int s = s1;
        int e = e2 - 1;
        while (s < e1 && s2 <= e) {
            if (Ss[i1].charAt(s) != Ss[i2].charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    
    private static long cost(int i1, int s1, int e1, int i2, int s2, int e2) {
        if (!isSameEdge(i1, s1, e1, i2, s2, e2)) {
            return Long.MAX_VALUE;
        }
        if (e1 - s1 == e2 - s2) {
            return 0;
        }
        
        long min = Long.MAX_VALUE;
        
        if (e1 - s1 < e2 - s2) {
            if (isPalindrome(i2, s2, e2 - e1 + s1)) {
                return 0;
            }
            
            for (int i = 0; i < N; i++) {
                long cost = cost(i, 0, Ss[i].length(), i2, s2, e2 - e1 + s1);
                if (cost < min - Cs[i]) {
                    min = cost + Cs[i];
                }
            }
            
        } else {
            if (isPalindrome(i1, s1 + e2 - s2, e1)) {
                return 0;
            }
            
            for (int i = 0; i < N; i++) {
                long cost = cost(i1, s1 + e2 - s2, e1, i, 0, Ss[i].length());
                if (cost < min - Cs[i]) {
                    min = cost + Cs[i];
                }
            }
        }
        
        return min;
    }
}
