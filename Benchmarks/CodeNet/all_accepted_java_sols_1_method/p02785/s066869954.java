import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long k=sc.nextLong();
        long ans = 0;
        long h[] = new long[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextLong();
        Arrays.sort(h);
        for (int i = 0; i < n - k; i++)
            ans += h[i];
        System.out.println(ans);
    }
}
