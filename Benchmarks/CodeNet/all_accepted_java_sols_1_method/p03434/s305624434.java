import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        int p[] = {0, 0};
        
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(sc.next());
        Arrays.sort(a);
        
        for (int i = n - 1; i >= 0; i--)
            if ((n - 1) % 2 == i % 2)
                p[0] += a[i];
            else
                p[1] += a[i];
        
        System.out.println(p[0] - p[1]);
    }
}