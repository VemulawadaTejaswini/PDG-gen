import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        int[] arr;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int a = arr[0];
        int b = arr[1];

        System.out.printf("%d %d %f", a / b, a % b, (double) a / b);
    }
}

