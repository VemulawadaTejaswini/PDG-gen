import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> V = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for (var e : br.readLine().split(" ")) {
            V.add(Integer.parseInt(e));
        }
        for (var e : br.readLine().split(" ")) {
            C.add(Integer.parseInt(e));
        }

        int res = 0;
        for (int i = 0; i < N; ++i) {
            var diff = V.get(i) - C.get(i);
            if (diff > 0) res += diff;
        }

        System.out.println(res);
    }
}

