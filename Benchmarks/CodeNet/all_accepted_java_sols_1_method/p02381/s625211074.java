import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (true) {
            int amount = scan.nextInt();
            if (amount == 0)
                break;
            int[] scores = new int[amount];
            for (int i = 0; i < amount; i++) {
                scores[i] = scan.nextInt();
            }

            double average = 0.0;
            for (int i = 0; i < amount; i++) {
                average += scores[i];
            }
            average = average / (double)amount;

            double sq_sum = 0.0;
            for (int i = 0; i < amount; i++) {
                sq_sum += Math.pow(scores[i] - average, 2);
            }

            output.append(Math.sqrt(sq_sum / amount)).append('\n');
        }

        System.out.print(output);
    }
}