import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in))) {
            var s = br.readLine().split(" ");
            var list = Stream.of(s).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
            System.out.println(list.indexOf(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}