import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            long sum = 0;
            sum += (X / 500) * 1000;
            sum += ((X % 500) / 5) * 5;
            System.out.println(sum);
        }
    }
}
