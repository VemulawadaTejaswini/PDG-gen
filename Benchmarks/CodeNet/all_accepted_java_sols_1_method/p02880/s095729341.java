import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        if (N < 0 || N > 81) {
            System.out.println("No");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            float value = N / (float) i;
            if (value < 1f) {
                break;
            }

            if (value <= 9 && (int) Math.floor(value) == (int) Math.ceil(value)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}