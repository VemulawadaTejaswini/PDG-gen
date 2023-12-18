import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            int[] A = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < n; i++) {
                int v = A[i];
                int j = i - 1;
                while (j >= 0 && A[j] > v) {
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = v;
                System.out.println(Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

