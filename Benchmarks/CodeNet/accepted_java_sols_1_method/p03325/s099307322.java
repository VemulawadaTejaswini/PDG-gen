import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int res = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());

            while (a % 2 == 0) {
                res++;
                a /= 2;
            }

        }

        System.out.println(res);
    }
}
