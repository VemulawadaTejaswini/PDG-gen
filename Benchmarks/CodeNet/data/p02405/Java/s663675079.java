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

                IntStream.rangeClosed(1, h).forEach(i -> {
                    if (i % 2 == 0) {
                        System.out.println(getEvenLineString(w, new StringBuilder()));
                    } else {
                        System.out.println(getOddLineString(w, new StringBuilder()));
                    }
                });

                System.out.println();
            }
        }
    }

    public static String getOddLineString(int n, StringBuilder sb) {

        if(sb.length() % 2 == 0) {
            sb.append("#");
        }else {
            sb.append(".");
        }

        if(n == 1) {
            return sb.toString();
        }else {
            return getOddLineString(n - 1, sb);
        }
    }

    public static String getEvenLineString(int n, StringBuilder sb) {
        if(sb.length() % 2 == 1) {
            sb.append("#");
        }else {
            sb.append(".");
        }

        if(n == 1) {
            return sb.toString();
        }else {
            return getEvenLineString(n - 1, sb);
        }
    }
}
