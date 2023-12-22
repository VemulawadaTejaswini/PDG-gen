import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String status = "APPROVED";
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a % 2 == 0 && !(a % 3 == 0 || a % 5 == 0)) {
                status = "DENIED";
            }
        }

        System.out.println(status);
    }
}
