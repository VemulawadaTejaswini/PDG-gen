import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n + 1];
        for(int i = 0 ; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] t = new int[q];
        for(int i = 0; i < q; i++) {
            t[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < q; i++) {
            s[n] = t[i];
            int j = 0;
            while(s[j] != s[n]) {
                j++;
            }
            if(j != n) ans++;
        }

        System.out.println(ans);

        sc.close();
    }
}
