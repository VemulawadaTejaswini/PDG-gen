import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String i : in) {
            list.add(Integer.parseInt(i));
        }

        br.close();

        Collections.sort(list);
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += list.get(i);
        }

        bw.write(String.valueOf(ans));

        bw.flush();

    }
}