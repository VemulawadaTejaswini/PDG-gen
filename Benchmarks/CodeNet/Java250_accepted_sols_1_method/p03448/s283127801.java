import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fivehundred = in.nextInt();
        int oneHundred = in.nextInt();
        int fifty = in.nextInt();
        int total = in.nextInt();

        int sum = 0;
        int patterns = 0;

        for (int i = 0; i < fivehundred + 1; i++) {
            for (int j = 0; j < oneHundred + 1; j++) {
                for (int k = 0; k < fifty + 1; k++) {
                    sum = 500 * i + 100 * j + 50 * k;
                    if (sum == total) {
                        patterns++;
                    }
                }
            }
        }
        System.out.println(patterns);
    }
}