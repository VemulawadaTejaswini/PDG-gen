import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n*m];
        int[] b = new int[m];
        int[] ret = new int[n];
        for (int i = 0;i < n*m;i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0;i < m;i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                ret[i] += a[i * m + j] * b[j];
            }
            System.out.println(ret[i]);
        }
        
    }
}