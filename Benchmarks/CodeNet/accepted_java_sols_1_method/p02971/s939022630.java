import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = Arrays.copyOf(a, n);
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(b[i] == a[n-1] ? a[n-2] : a[n-1]);
        }
        sc.close();

    }

}
