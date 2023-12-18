import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OptionalLong result = LongStream.iterate(1, l -> l + 1).limit(n).reduce((l, l2) -> l * l2);
        Long r = result.getAsLong();
        System.out.println(r);
    }
}