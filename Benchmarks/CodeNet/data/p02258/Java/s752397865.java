import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        final Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }


        int min = numbers[0];
        int min_i = 0;
        int max = numbers[length - 1];
        int max_i = length - 1;
        for (int i = 1; i < length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                min_i = i;

                int j;
                for (j = max_i; j > min_i; j--) {
                    if (numbers[j] > max) {
                        max = numbers[j];
                        max_i = j;
                        break;
                    }
                }

                if (j == min_i) {
                  break;
                }
            }
        }

        System.out.println(max - min);
    }
}

