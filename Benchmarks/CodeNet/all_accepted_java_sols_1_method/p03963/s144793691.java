import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long ans = k;
        for (int i = 0; i < n - 1; i++) {
            ans *= (k - 1);
        }
        System.out.println(ans);
    }
}