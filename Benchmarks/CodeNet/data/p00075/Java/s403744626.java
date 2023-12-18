import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double[] l = Stream.of(sc.next().split(",")).map(Double::parseDouble).toArray(Double[]::new);
            if (l[1] / l[2] / l[2] >= 25)
                System.out.println(l[0].intValue());
        }
    }
}
