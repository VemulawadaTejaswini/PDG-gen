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
            if (numbers[i] == 2) {
                count++;
            }
        }

        for (int number : numbers) {

            boolean flg = true;
            if (number % 2 == 0) {
              continue;
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    flg = false;
                    break;
                }
            }

            if (flg){
              count++;
            }

        }

        System.out.println(count);
    }
}

