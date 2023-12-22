import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // long N = s.nextLong();
        int M = s.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M-1; i++) {
            a[i] = s.nextInt();
        }

        int[] b = new int[a.length+1];
        Arrays.fill(b, 0);
        for (int i = 0; i < M; i++) {
            int l = a[i];
            b[l] += 1;
        }

        for (int i = 1; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}