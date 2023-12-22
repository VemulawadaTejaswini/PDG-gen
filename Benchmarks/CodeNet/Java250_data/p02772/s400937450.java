
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean res = true;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A != 0 && A % 2 != 0) {
                continue;
            }
            if (A % 3 == 0 || A % 5 == 0) {
                continue;
            }
            res = false;
        }
        if (res) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }

}