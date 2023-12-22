import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(in.readLine());
            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j > i; j--) {
                    if (arr[j] < arr[j - 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = tmp;
                        cnt++;
                    }
                }
            }

            System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
