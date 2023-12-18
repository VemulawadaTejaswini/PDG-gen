import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int ans = x + n;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= d; j++) {
                int tmp = j * a[i] + 1;
                if(tmp <= d) {
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}