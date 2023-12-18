import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(var br = new BufferedReader(new InputStreamReader(System.in))) {

            var nk = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(IntStream.of(Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()).sorted().limit(nk[1]).sum());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}