import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for (int i = 0 ; i < m ;i++) {
            l[i] = sc.nextInt() ;
            r[i] = sc.nextInt() + 1;
        }
        int [] t = new int[n + 2];

        for (int i = 0 ; i < m ; i++) {
            t[l[i]]++;
            t[r[i]]--;
        }

        for (int i = 0 ; i <= n ; i++) {
            if (i > 0) t[i] += t[i - 1];
        }

        int count = 0;
        for (int i = 0 ; i < n+ 1 ; i++) {
            if (t[i] == m) count++;
        }

        System.out.println(count);


    }

}