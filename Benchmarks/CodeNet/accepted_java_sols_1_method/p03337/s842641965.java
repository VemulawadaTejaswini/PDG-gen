import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = Math.max(a * b, Math.max(a + b, a - b));
            System.out.println(ans);
        }
    }

}
