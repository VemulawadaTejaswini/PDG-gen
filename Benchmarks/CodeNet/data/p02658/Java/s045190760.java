import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        try {
            Long result = IntStream.range(0, n).mapToLong(m -> sc.nextInt()).reduce((v1, v2) -> v1 * v2).getAsLong();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
