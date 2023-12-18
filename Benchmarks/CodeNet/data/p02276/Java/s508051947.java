import java.util.*;

public class Main {
    static long count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //数列の長さ
        int[] a = new int[n]; //数列A
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int x = partition(a, 0, a.length-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i>0) sb.append(" ");
            if(i==x) sb.append("[" + a[i] + "]");
            else sb.append(a[i]);
        }
        System.out.println(sb); //出力
    }
    /**
     * Partition
     */
    static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p-1;
        for(int j=p; j<r; j++) {
            if(a[j]<=x) {
                i++;
                int g = a[j];
                a[j] = a[i];
                a[i] = g;
            }
        }
        int g = a[i+1];
        a[i+1] = a[r];
        a[r] = g;
        return i+1;
    }
}
