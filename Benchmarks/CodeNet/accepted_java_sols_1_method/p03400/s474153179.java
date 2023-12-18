import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int ans = x;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            ans += 1 + (d-1) / a[i];
        }
        System.out.println(ans);
        
    }
}