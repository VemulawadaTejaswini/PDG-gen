import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    static int h, w;

    public static void main(String[] args) throws NumberFormatException, IOException{

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {

                int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                h = arr[0];
                w = arr[1];

                if (h == 0 && w == 0) {
                    break;
                }

                IntStream.range(0, h).forEach(i -> System.out.println(generateLineString(w, new StringBuilder())));
                System.out.println();
            }
        }
    }

    public static String generateLineString(int n, StringBuilder sb) {
        if(n == 0) {
            return sb.toString();
        }else {
            sb.append("#");
            return generateLineString(n - 1, sb);
        }
    }
}
