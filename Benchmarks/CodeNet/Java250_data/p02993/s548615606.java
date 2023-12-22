import java.util.Scanner;

/**
 * AtCoder Beginner Contest 131<br>
 * A - Security<br>
 * <br>
 * https://atcoder.jp/contests/abc131/tasks/abc131_a<br>
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] input = sc.nextLine().split("");

            Result r = renzokuNum(input);
            switch (r) {
                case Good:
                    System.out.println("Good");
                    break;
           
                default:
                    System.out.println("Bad");
                    break;
            }
        }
    }

    private static Result renzokuNum(String[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].equals(input[i + 1])) {
                return Result.Bad;
            }
        }
        return Result.Good;
    }

    enum Result {
        Good,
        Bad,
    }
}