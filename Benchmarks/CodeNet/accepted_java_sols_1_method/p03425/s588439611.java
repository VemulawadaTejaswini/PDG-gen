import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[5];
        
        
        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            if (ch == 'M')
                a[0]++;
            else if (ch == 'A')
                a[1]++;
            else if (ch == 'R')
                a[2]++;
            else if (ch == 'C')
                a[3]++;
            else if (ch == 'H')
                a[4]++;
        }
        
        long ans = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = i+1; j <= 3; j++) {
                for (int k = j+1; k <= 4; k++) {
                    ans += a[i] * a[j] * a[k];
                }
            }
        }
        
        System.out.println(ans);
    }
}