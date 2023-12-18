import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int result = A >= 13 ? B : A >= 6 && A <= 12 ? B / 2 : 0;

            System.out.println(result);

        }
    }

}