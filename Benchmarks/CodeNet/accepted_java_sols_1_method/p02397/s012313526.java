import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            while (!"0 0".equals(s = br.readLine())) {
                int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
                int a = arr[0];
                int b = arr[1];

                if (a > b) {
                    int tmp = b;
                    b = a;
                    a = tmp;
                }

                System.out.printf("%d %d%n", a, b);
            }
        }
    }
}

