import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int q     = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < q; i++) {
            int ti = sc.nextInt();
            s[n]   = ti;
            int j  = 0;
            while (true) {
                if (ti == s[j]) break;
                else j++;
            }
            if (j != n) count++;
        }

        System.out.println(count);
    }
}
