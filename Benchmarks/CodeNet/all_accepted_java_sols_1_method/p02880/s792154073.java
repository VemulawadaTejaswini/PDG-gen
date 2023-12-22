import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ans = IntStream.range(1,10).anyMatch(i -> N % i == 0 && N / i <= 9);
        System.out.println(ans ? "Yes" : "No");
    }
}