import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (i!=sc.nextInt()) cnt += 1;
        }
        System.out.println(cnt<= 2? "YES": "NO");
    }
}