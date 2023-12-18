import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        long all = Math.abs(a[0]) + Math.abs(a[n-1]);
        for(int i=0; i<n-1; i++){
            all += Math.abs(a[i+1] - a[i]);
        }

        System.out.println(all - Math.abs(a[0]) - Math.abs(a[1] - a[0]) + Math.abs(a[1]));
        for(int i=1; i<n-1; i++){
            System.out.println(all - Math.abs(a[i] - a[i-1]) - Math.abs(a[i+1] - a[i]) + Math.abs(a[i+1] - a[i-1]));
        }
        System.out.println(all - Math.abs(a[n-1] - a[n-2]) - Math.abs(a[n-1]) + Math.abs(a[n-2]));
    }
}
