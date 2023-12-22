import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        int count = h[0];
        for (int i = 1; i < n; i++) {
            count += Math.max(h[i] - h[i-1], 0);
        }
        System.out.println(count);
    }
}

