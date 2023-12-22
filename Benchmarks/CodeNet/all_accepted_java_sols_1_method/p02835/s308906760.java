import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream A = IntStream.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(A.sum() >= 22 ? "bust" : "win");
    }
}