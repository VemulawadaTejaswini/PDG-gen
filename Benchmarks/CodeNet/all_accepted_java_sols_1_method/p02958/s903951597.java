import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (scan.nextInt() - i != 1) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}