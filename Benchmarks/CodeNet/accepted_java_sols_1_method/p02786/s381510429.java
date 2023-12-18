import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long H = sc.nextLong();

            long ans = 0;

            while (H > 0) {
                ans = ans * 2 + 1;

                H = H / 2;
            }

            System.out.println(ans);
        }
    }

}
