import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long h = sc.nextInt();
        long w = sc.nextInt();

        long a = 0;
        long b = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            if (a >= h && b >= w)
                cnt++;
        }

        System.out.print(cnt);
    }
}
