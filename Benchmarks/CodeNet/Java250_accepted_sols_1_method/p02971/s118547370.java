import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0, second = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max <= a[i]) {
                second = max;
                max = a[i];
            } else if (second < a[i]) {
                second = a[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (a[i] != max) {
                System.out.println(max);
            } else {
                System.out.println(second);
            }
        }
    }
}