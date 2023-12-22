import java.util.Scanner;

/**
 * @author nakker
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        float result = 0f;
        for (int i = 0; i < count; i++) {
            result += 1 / scanner.nextFloat();
        }
        System.out.println(1 / result);
    }
}
