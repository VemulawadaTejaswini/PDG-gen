import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char alpha = br.readLine().charAt(0);

        if (alpha > 96) {
            bw.write("a\n");
        } else {
            bw.write("A\n");
        }

        bw.close();
        br.close();
    }
}
