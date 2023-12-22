import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Z = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        if (N==1) {
            System.out.println(Math.abs(a[N-1]-W));
        } else {
            System.out.println(Math.max(Math.abs(a[N-1]-W), Math.abs(a[N-1]-a[N-2])));
        }
    }
}