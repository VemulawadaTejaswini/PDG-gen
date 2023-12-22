import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            array[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            array[p] = 1;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < x; i++) {
            a += array[i];
        }
        for (int i = x; i < n; i++) {
            b += array[i];
        }
        
        System.out.println(Math.min(a, b));
        
    }
}
