import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        long[] as = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            n = Integer.parseInt(elems[0]);
            elems = br.readLine().split(" ");
            as = new long[n*3];
            for (int i = 0; i < elems.length; i++) {
                as[i] = Long.parseLong(elems[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Arrays.sort(as);
        long sum = 0;
        int head = 0;
        int last = as.length - 2;
        while (head < last) {
            sum += as[last];
            head++;
            last--;last--;
        }
        System.out.println(sum);
    }
}
