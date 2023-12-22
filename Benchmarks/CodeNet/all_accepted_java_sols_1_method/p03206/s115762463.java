import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.print("Christmas");
        IntStream.range(0, 25-d)
                .forEach(i -> {
                    System.out.print(" Eve");
                });
    }
}
