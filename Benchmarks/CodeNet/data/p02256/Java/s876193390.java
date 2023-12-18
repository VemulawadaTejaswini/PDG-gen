import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        final Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];

        int max = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] == 2) {
                count++;
            }
        }

        for (int i = 3; i <= max; i += 2) {
            int k = 0;
            for(int j = 3;j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    k = 1;
                    break;
                }
            }

            if(k == 0) {
                count++;
            };
        }

        System.out.println(count);
    }
}

