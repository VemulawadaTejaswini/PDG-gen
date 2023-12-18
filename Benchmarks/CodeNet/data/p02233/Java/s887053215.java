import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine()) - 1;
        System.out.println(
            Stream.iterate(new int[]{1, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .skip(n < 0 ? 0 : n)
                .map(fib -> fib[1])
                .findFirst()
                .orElse(1)
        );
    }
}