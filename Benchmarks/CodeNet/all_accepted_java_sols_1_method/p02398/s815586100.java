import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        int[] arr;
        long count;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            count = IntStream.rangeClosed(arr[0], arr[1]).filter(i -> arr[2] % i == 0).count();
        }

        System.out.println(count);
    }
}

