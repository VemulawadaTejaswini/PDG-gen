
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int h = scanner.nextInt();
        int K = scanner.nextInt();
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int X= H * a + h * b + H / 10 * c + h / 20 * d;
        int Y= K * a + k * b + K / 10 * c + k / 20 * d;
        if (X>Y)
            System.out.println("hiroshi");
        else if (X<Y)
            System.out.println("kenjiro");
        else
          System.out.println("even");
        }

    }

