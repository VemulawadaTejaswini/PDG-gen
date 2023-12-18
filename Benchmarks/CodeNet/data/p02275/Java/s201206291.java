import java.util.*;

public class Main {
    static long count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //数列の長さ
        int[] a = new int[n]; //数列A
        int max = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        int[] b = new int[n];
        countingSort(a, b, max);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i==0) sb.append(b[i]);
            else sb.append(" " + b[i]);
        }
        System.out.println(sb); //出力
    }
    /**
     * 計数ソート
     */
    static void countingSort(int[] a, int[] b, int k) {
        int[] c = new int[k+1];
        for(int x : a) c[x]++;
        for(int i=1; i<=k; i++) c[i] += c[i-1];
        for(int i=a.length-1; i>=0; i--) { //数列Aの後ろから詰める
            b[c[a[i]]-1] = a[i];
            c[a[i]]--;
        }
    }
}
