import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 200000;
        int[] b = new int[n];
        int[] a = new int[m+1];

        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
            a[b[i]]++;
        }
        long sum = 0;
        for(int i=1; i<m; i++) {
            sum += ((long)a[i] * (a[i]-1) / 2);
        }

        for(int i=0; i<n; i++) {
            int num = b[i];
            long res = sum - (long)a[num] * (a[num]-1) / 2 + (long)(a[num]-1) * (a[num]-2) / 2;
            System.out.println(res);
        }
    }


}