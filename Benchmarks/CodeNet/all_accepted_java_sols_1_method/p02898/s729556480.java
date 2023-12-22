import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = n;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() < k) {
                ans -= 1;
            }
        }
        System.out.println(ans);
}}