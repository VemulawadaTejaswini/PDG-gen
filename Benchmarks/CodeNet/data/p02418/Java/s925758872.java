import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = br.readLine().toCharArray();
        char[] st = br.readLine().toCharArray();
        int size = input.length;
        int size2 = st.length;
        boolean answer = false;
        for (int i = 0; i < size; i++) {
            boolean chk = true;
            int j = 0;
            int k = i;
            while (j < size2 && k < size) {
                if (st[j] != input[k]) {
                    chk = false;
                    break;
                }
                if (++k == size) k %= size;
                j++;
            }
            if (chk) {
                answer = true;
                break;
            }
        }

        bw.append(answer ? "Yes\n" : "No\n");
        bw.flush();
    }


}
