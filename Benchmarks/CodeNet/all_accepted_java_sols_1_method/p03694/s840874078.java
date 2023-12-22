import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int min = 1000;
        int max = 0;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }
        System.out.println(max-min);
     }
}