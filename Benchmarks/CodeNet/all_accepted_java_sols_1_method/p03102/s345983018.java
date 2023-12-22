import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int ans = 0;
        for (int i = 0; i < N; i++) {
            List<Integer> l = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += list.get(j) * l.get(j);
            }
            if (sum + C > 0) {
                ans++;
            }
        }
        out.println(ans);
        out.close();
    }
}
