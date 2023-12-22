import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;


class Main {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final long sum = IntStream.rangeClosed(0, NAB[0]).filter(i -> {
            int digitSum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
            return NAB[1] <= digitSum && digitSum <= NAB[2];
        })
        .sum();

        System.out.println(sum);

    }
}