import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int cnt = 0;
        int now = A;

        while (now <= T) {
            now += A;
            cnt += B;
        }

        System.out.println(cnt);

    }
}
