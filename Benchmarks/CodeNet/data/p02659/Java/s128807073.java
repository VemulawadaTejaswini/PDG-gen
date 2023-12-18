import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long A = scan.nextLong();
        Double B = scan.nextDouble();

        double sum = A * B;
        long result = (long)sum;
        System.out.println(result);
    }
}

