import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        double b = sc.nextDouble();
        long sum = (long)Math.floor(a * b);

        System.out.println(sum);

    }
}