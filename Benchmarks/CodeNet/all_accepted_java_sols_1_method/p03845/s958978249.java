import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int ans = 0;
        for (int i=0;i<n;i++) {
            array[i] = sc.nextInt();
            ans += array[i];
        }
        int m = sc.nextInt();
        for (int i=0;i<m;i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(ans - array[p-1] + x);
        }

    }
}