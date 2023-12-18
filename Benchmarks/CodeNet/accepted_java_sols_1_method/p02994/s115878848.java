import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int ans = n * (n + 1) / 2 + n * (l - 1)
                - (l + (l > 0 ? 1 : (n > -l ? -l + 1 : n)) - 1);
        System.out.println(ans);
    }
}
