import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long power = 1;
        for (long i = 1; i < n + 1; i++) {
            power *= i;
            power %= 1000000000 + 7;
            //power = i * (power % (1000000000 + 7));
        }
        System.out.println(power);
    }

}
