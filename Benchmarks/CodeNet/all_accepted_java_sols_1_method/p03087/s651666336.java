import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < r.length; i++) {
            l[i] = sc.nextInt() - 1;
            r[i] = sc.nextInt() - 1;
        }
        int[] a = new int[n];
        for (int i = 0; i < a.length - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                a[i]++;
            }
        }
        int[] sum = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            sum[i + 1] = sum[i] + a[i]; 
        }
        for (int i = 0; i < r.length; i++) {
           System.out.println(sum[r[i]] - sum[l[i]]);
        }
        sc.close();
    }
}