import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int bird = 0; bird < X + 1; bird++) {
            for (int turtle = 0; turtle < X + 1; turtle++) {
                if (X == bird + turtle && Y == 2 * bird + 4 * turtle) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}