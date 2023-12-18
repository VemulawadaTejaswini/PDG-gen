import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg += a[i];
        }
        avg /= n;
        
        double min = 100;
        for (int i = n-1; i >= 0; i--) {
            if (Math.abs(avg - a[i]) <= min) {
                min = Math.abs(avg - a[i]);
                ans = i;
            }
        }
        
        System.out.println(ans);
    }
}