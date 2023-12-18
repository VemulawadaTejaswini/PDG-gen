import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] a = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            x[i] = b;
            a[i] = b;
        }

        Arrays.sort(a);
        int c = n / 2;

        for (int i = 0; i < n; i++) {
                if (x[i] <= a[c - 1]) {
                    System.out.println(a[c]);
                } else {
                    System.out.println(a[c - 1]);
                }
            }

        sc.close();
    }    
}
