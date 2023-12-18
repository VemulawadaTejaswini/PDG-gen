import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int[] taro;
    public static int[] hana;
    public static long res;
    public static int at;
    public static int ah;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;
            taro = new int[n];
            hana = new int[m];
            res = Integer.MAX_VALUE;
            at = 0;
            ah = 0;
            for (int i = 0; i < n; i++) {
                taro[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                hana[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int t = taro[i];
                    taro[i] = hana[j];
                    hana[j] = t;
                    if (sum(taro) == sum(hana)) {
                        int tmp = taro[i] + hana[j];
                        if (tmp < res) {
                            at = hana[j];
                            ah = taro[i];
                            res = tmp;
                        }
                    }
                    t = taro[i];
                    taro[i] = hana[j];
                    hana[j] = t;
                }
            }
            if (res == Integer.MAX_VALUE) {
                System.out.println("-1");
            } else {
                System.out.println(at + " " + ah);
            }
        }
    }
    
    public static long sum(int[] ary) {
        long sum = 0;
        for (int i = 0; i < ary.length; i++) {
            sum += ary[i];
        }
        return sum;
    }
}