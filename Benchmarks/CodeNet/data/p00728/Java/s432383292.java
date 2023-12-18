import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res;
    public static long[] ary;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            res = 0;
            ary = new long[n];
            for (int i = 0; i < n; i++) {
                ary[i] = sc.nextLong();
            }
            
            Arrays.sort(ary);
            
            for (int i = 1; i < n-1; i++) {
                res += ary[i];
            }
            
            System.out.println(res/(n-2));
        }
    }
}