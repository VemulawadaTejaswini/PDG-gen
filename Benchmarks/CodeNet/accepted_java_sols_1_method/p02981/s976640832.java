import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int A = Integer.parseInt(array[1]);
            int B = Integer.parseInt(array[2]);

            System.out.println(Math.min(N * A, B));
        }
    }

}
