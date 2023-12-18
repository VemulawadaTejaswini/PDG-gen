import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine().split(" ")[1]);
        System.out.println(Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).filter(h -> k <= h).count());
    }
}