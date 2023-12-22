import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();

        long sum = 100;
        int count = 0;
        do {
            sum = (long) (sum * 1.01);
            count++;

        } while (sum < X);

        System.out.println(count);

    }

}
