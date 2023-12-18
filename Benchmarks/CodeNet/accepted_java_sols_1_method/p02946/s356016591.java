import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();

        System.out.println(IntStream.range(x - k + 1, x + k).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(" ")));
    }
}
