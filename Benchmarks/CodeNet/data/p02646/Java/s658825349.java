import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            if ((A + V * i) == (B + W * i)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}