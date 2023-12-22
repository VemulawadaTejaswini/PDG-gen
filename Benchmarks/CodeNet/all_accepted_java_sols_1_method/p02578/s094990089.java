import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        long sum = 0;
        for(int i=0; i<a.length; i++) {
            if(i == a.length-1) break;
            if(a[i] > a[i+1]) {
                sum += a[i] - a[i+1];
                a[i+1] = a[i+1] + (a[i] - a[i+1]);
            }
        }
        System.out.println(sum);
    }
}
