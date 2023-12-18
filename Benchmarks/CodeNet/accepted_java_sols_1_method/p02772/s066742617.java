import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean denided = false;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                if (a % 3 != 0 && a % 5 != 0) {
                    denided = true;
                    break;
                }
            }
        }
        System.out.println(denided ? "DENIED" : "APPROVED");
    }
}