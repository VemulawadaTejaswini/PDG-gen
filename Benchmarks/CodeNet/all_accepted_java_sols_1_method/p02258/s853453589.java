import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());

            int maxv = Integer.MIN_VALUE;
            int minv = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(in.readLine());
                int tmp = x - minv;
                if (maxv < tmp) maxv = tmp;
                if (x < minv)  minv = x;
            }

            System.out.println(maxv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

