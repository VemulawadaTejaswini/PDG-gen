import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            //arr[i] -= i+1;
        }
        //Arrays.sort(arr)
        // 11222;
        for (int i=1; i<a.length; i++) {
            if (a[i] == a[i-1]) {
                sum++;
                a[i] = a[i-1]+1;
                if (i<a.length-1 && a[i] == a[i+1]) a[i] = a[i+1]-1;
            }
        }
        System.out.println(sum);
    }
}