import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        int asum = 0;
        int bsum = 0;
        for(int i=n-1; i>=0; i--) {
            if((n-1) % 2 == 0) {
                if(i % 2 == 0) asum += a[i];
                else bsum += a[i];
            }else {
                if(i % 2 == 1) asum += a[i];
                else bsum += a[i];
            }
        }
        
        System.out.println(asum - bsum);
    }
}
