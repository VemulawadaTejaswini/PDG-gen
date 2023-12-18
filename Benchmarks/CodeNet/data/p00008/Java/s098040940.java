import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final int n = scanner.nextInt();

            System.out.println(countOfSumCombination(n));
        }
    }

    static int countOfSumCombination (int value) {
        int count = 0;
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        if (a + b + c + d == value) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

}