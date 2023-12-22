import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String[] split = br.readLine().split("\\s+");
            Deque<Integer> q = new ArrayDeque<>(n);
            for (String s: split) {
                q.add(Integer.parseInt(s));
            }
            int k = 0;
            int i = 1;
            while (!q.isEmpty() && k < n) {
                if (i == q.removeFirst()) {
                    i++;
                } else {
                    k++;
                }
            }

            if (!q.isEmpty() || k >= n) {
                System.out.println(-1);
            } else {
                System.out.println(k);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}