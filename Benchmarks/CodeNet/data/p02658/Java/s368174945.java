import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        try {
            long result = IntStream.range(0, n).mapToLong(m -> sc.nextLong()).reduce((v1, v2) -> v1 * v2).getAsLong();
            if (result > Math.pow(10, 18)){
                System.out.println("-1");
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
