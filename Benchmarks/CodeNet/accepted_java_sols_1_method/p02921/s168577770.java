import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String pText = std.next();
        String aText = std.next();
        String[] ps = pText.split("");
        String[] as = aText.split("");
        int result = IntStream.range(0, ps.length)
                .reduce(0, (acc, it) -> {
                    String p = ps[it];
                    String a = as[it];
                    if (p.equals(a)) {
                        acc++;
                    }
                    return acc;
                });

        System.out.println(result);
    }
}
