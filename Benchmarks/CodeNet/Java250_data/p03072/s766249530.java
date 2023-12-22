import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i =0; i<n; i++) {
            h[i] = sc.nextInt();
        }

        int result = 0;
        int baseHight =-1;

        for (int i =0; i<n; i++) {
           if (baseHight <= h[i]) {
               result++;
               baseHight = h[i];
           } 
        }
        System.out.println(result);
        sc.close();
    }
}