import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 数の準備
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // 魔法の回数
        int magicNumber = sc.nextInt();

        while (magicNumber > 0) {
            if (numbers[0] >= numbers[1]) {
                numbers[1] *= 2;
            } else if (numbers[1] >= numbers[2]) {
                numbers[2] *= 2;
            }
            magicNumber--;
        }

        if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
