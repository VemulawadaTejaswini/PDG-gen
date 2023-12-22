import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int ans;
        if (h >= w) {
            if (n % h != 0) ans = n / h + 1;
            else ans = n / h;
        } else {
            if (n % w != 0) ans = n / w + 1;
            else ans = n / w;
        }
        System.out.println(ans);
    }
}
