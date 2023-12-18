import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int H = sc.nextInt();
        final int N = sc.nextInt();

        int total = 0;
        for (int i = 0; i < N; i++) {
            total += sc.nextInt();
        }

        if (total >= H) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
