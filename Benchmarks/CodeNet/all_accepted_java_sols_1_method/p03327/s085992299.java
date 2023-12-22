import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        String result = null;

        if (n >= 1000) {
            result = "ABD";
        } else {
            result = "ABC";
        }
        System.out.println(result);

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}
