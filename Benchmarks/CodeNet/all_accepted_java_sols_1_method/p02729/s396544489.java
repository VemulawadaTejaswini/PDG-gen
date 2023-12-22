import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long start1 = System.currentTimeMillis();
//        long end1 = System.currentTimeMillis();
//        System.out.println("time1: " + (end1 - start1));

        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        int result = n * (n - 1) / 2 + m * (m - 1) / 2;

        System.out.println(result);
    }
}