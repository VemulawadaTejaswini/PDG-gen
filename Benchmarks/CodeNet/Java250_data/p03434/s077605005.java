import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        int diff = 0;
        for (int i=0;i<n/2;i++) {
            diff += a[2*i] - a[2*i+1];
        }
        if ((n & 1) == 1)
            diff += a[n-1];
        System.out.println(diff);
    }
}