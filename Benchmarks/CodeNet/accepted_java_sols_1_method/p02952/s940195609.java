import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).length() % 2 != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}