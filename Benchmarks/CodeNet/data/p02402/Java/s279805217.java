import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int min = Integer.MAX_VALUE, max = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st[i]);
            if (min > now) {
                min = now;
            }
            if (max == 0 || max < now) {
                max = now;
            }
            sum += now;
        }
        bw.append(min + " " + max + " " + sum + "\n");
        bw.flush();
    }


}
