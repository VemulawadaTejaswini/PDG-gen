import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[30];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                a[sc.nextInt() - 1]++;
            }
        }


        int ans = 0;
        for (int j = 0; j < m; j++) {
            if(a[j] == n) ans++;
        }

        System.out.println(ans);
    }
}
