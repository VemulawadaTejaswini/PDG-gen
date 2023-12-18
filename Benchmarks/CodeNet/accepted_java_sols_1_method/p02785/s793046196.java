import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        long a = 0L;
        Arrays.sort(h);
        for (int i = 0; i < n; i++) {
            if(i < k) continue;
            a += h[n-1-i];
        }
        System.out.println(a);
        sc.close();

    }

}
