import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //数列の長さ
    int[] a = new int[n];
    for (int i=0; i<n; i++) { //数列読み込み
        a[i] = sc.nextInt();
    }
    out(a,n);
    sort(a,n);
    }
    /**
     * ソート
     * @param a
     * @param n
     */
    public static void sort(int[] a, int n) {
        for (int i=1; i<n; i++) {
            int v = a[i];
            int j = i-1;
            while(j>=0 && a[j]>v) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            out(a,n);
        }
    }
    /**
     * 出力
     * @param a
     * @param n
     */
    public static void out(int[] a, int n) {
        for (int i=0; i<n; i++) {
            if(i==n-1) {
                System.out.print(a[i]);
                System.out.println();
            } else {
                System.out.print(a[i]+" ");
            }
        }
    }
}

