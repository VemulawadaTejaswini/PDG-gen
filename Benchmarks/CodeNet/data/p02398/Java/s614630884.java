import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long divisor = IntStream.range(a, b + 1).filter(x -> (c % x) == 0).count();
        System.out.println(divisor);
        sc.close();
    }
}

