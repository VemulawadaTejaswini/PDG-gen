import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if(max < p) {
                max = p;
            }
            ans += p;
        }
        ans = ans - max + max / 2;
        System.out.println(ans);
    }
}