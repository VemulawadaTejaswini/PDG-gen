import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double n = (double) (s.nextInt());
        double probability;

        probability = n % 2 == 0 ? (n / (2 * n)) : (Math.floor(n / 2) + 1) / n;

        System.out.println(probability);
    }
}