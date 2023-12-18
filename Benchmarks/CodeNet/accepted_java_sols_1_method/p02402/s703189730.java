import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        long[] data = Stream.of(br.readLine().split(" "))
            .mapToLong(Long::parseLong).toArray();
        long min = data[0];
        long max = data[0];
        for (int i = 0; i < n; i++) {
            if (max < data[i]) {
                max = data[i];
            } else if (data[i] < min) {
                min = data[i];
            }
            sum += data[i];
        }
        System.out.println(min + " " + max + " " + sum);
    }
}