import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] signs = {'+', '-'};
        int num = sc.nextInt();
        int[] numbers = {0, 0, 0, 0};
        boolean done = false;

        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = num % 10;
            num = num / 10;
        }

        for (char i:signs) {
            for (char j:signs) {
                for (char k:signs) {
                    int sum = numbers[0];
                    if (i == '+') {
                        sum += numbers[1];
                    } else if (i == '-') {
                        sum -= numbers[1];
                    }
                    if (j == '+') {
                        sum += numbers[2];
                    } else if (j == '-') {
                        sum -= numbers[2];
                    }
                    if (k == '+') {
                        sum += numbers[3];
                    } else if (k == '-') {
                        sum -= numbers[3];
                    }

                    if (sum == 7 && done == false) {
                        System.out.println(String.valueOf(numbers[0]) + i + String.valueOf(numbers[1]) + j + String.valueOf(numbers[2]) + k + String.valueOf(numbers[3]) + "=7");
                        done = true;
                    }
                }
            }
        }
    }
}
