import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int [] a = new int[101];
        for (int i = 0 ; i <= 100 ; i++) {
            if (i >= A && i <= B) {
               a[i]++;
            }
            if (i >= C && i <= D) {
                a[i]++;
            }
        }
        int ans = 0;
        for (int i = 0 ; i <= 100 ; i++) {
            if (a[i] == 2) {
                ans++;
            }
        }
        if (ans != 0) {
            System.out.println(ans - 1);
        } else {
            System.out.println(ans);
        }


    }
}
