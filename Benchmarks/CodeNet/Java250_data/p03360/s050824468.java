import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] a = new long[3];
        a[0] = in.nextLong(); a[1] = in.nextLong(); a[2] = in.nextLong();
        int k = in.nextInt();
        Arrays.sort(a);
        a[2] = a[2] * (long)Math.pow(2, k);
        System.out.println(a[0] + a[1] + a[2]);
    }
}