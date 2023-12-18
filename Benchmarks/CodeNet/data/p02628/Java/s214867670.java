import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(var br = new BufferedReader(new InputStreamReader(System.in))) {

            var nk = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            var px = new int[nk[0]];
            for (int i = 0; i < nk[0]; i++) {
                px[i] = Integer.parseInt(br.readLine());
            }

            System.out.println(IntStream.of(px).sorted().limit(nk[1]).sum());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}