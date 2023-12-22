import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holiday = scanner.nextInt();
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            holiday -= scanner.nextInt();
            if (holiday < 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(holiday);
    }
}
