import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (isRightTriAngle(a, b, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isRightTriAngle(int side_a, int side_b, int side_c) {
        int[] sides = { side_a, side_b, side_c };
        Arrays.sort(sides);

        int a_2 = (int)Math.pow(sides[0], 2);
        int b_2 = (int)Math.pow(sides[1], 2);
        int c_2 = (int)Math.pow(sides[2], 2);

        return a_2 + b_2 == c_2;
    }

}