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
        int i = 1;

        do {
            int x = i;
            if (CHECK_NUM(x) != -1) {
                bw.append(" " + i);
            } else {
                loop:
                while (x > 0) {
                    if (INCLUDE3(x) != -1) {
                        bw.append(" " + i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
        while (++i <= n);
        bw.newLine();
        bw.flush();
    }

    static int INCLUDE3(int x) {
        if (x % 10 == 3) {
            return x;
        }
        return -1;
    }

    static int CHECK_NUM(int x) {
        if (x % 3 == 0) {
            return x;
        }
        return -1;
    }

}
