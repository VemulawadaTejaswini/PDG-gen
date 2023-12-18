import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n == 0 && k == 0) {
                break;
            }

            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            int[] s = new int[n+1];
            for(int i=0; i<n; i++) {
                s[i+1] = s[i] + a[i];
            }

            int ans = 0;
            int tmp = 0;
            for(int i=0; i<=n-k; i++) {
                tmp = s[i+k] - s[i];
                if(ans < tmp) {
                    ans = tmp;
                }
            }
            System.out.println(ans);
        }
    }
}

