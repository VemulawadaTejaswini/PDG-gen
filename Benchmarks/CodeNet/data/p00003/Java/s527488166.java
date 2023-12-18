import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(
            br.lines().skip(1)
                .map(s -> Stream.of(s.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray())
                .map(i -> {Arrays.sort(i); return i;})
                .map(i -> Math.pow(i[0], 2) + Math.pow(i[1],2) == Math.pow(i[2], 2))
                .map(b -> b ? "YES" : "NO")
                .collect(joining("\n")));
    }
}