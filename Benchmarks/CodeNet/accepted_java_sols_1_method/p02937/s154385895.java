import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char[] ss  = sc.next().toCharArray();
        int n = ss.length;
        int[] s = new int[n];
        for(int i=0; i<n; i++) {
            s[i] = ss[i] - 'a';
        }
        char[] tt  = sc.next().toCharArray();
        int m = tt.length;
        int[] t = new int[m];
        for(int i=0; i<m; i++) {
            t[i] = tt[i] - 'a';
        }

        int[][] a = new int[26][n + 1];
        for(int i=0; i<26; i++) {
            a[i][n] = Integer.MAX_VALUE;
            for(int j=n-1; j>=0; j--) {
                if(s[j] == i) {
                    a[i][j] = j;
                } else {
                    a[i][j] = a[i][j+1];
                }
            }
        }


        int x = 0;
        int y = n;

        for(int q : t) {
            int p = a[q][y];
            if(p == Integer.MAX_VALUE) {
                x++;
                if(a[q][0] == Integer.MAX_VALUE) {
                    System.out.println(-1);
                    return;
                }
                y=a[q][0] + 1;
            } else {
                y= p + 1;
            }

        }
        System.out.println((long) (x-1) * n + y);
    }

}
