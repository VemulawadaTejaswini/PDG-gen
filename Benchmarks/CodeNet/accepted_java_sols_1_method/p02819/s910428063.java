import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = x; i <= 1000000; i++) {
            boolean result = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = false;
                }
            }
            if (result) {
                System.out.println(i);
                return;
            }

        }
    }
}