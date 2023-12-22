import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] param = br.readLine().split(" ");
        int N = Integer.parseInt(param[0]);
        int K = Integer.parseInt(param[1]);

        String[] line = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        int minTime = 0;

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(line[i]));
        }

        for (int i = 0; i < N - (K - 1); i++) {
            int time = 0;
            int left = list.get(i);
            int right = list.get(i + (K - 1));

            if (left >= 0) { // 両方正
                time = right;
            } else if (right <= 0) { // 両方負
                time = left * (-1);
            } else { // rightが正、leftが負
                if (left * (-1) < right) {
                    time = left * (-2) + right;
                } else {
                    time = left * (-1) + right * 2;
                }
            }
            if (minTime == 0 || time < minTime) {
                minTime = time;
            }
        }
        out.println(minTime);
        out.close();
    }
}