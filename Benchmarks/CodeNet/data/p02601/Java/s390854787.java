import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);
        st = new StringTokenizer(read.readLine());
        int A = parseInt(st.nextToken()), B = parseInt(st.nextToken()), C = parseInt(st.nextToken());
        int k = parseInt(read.readLine());

        for (int i = 0; i < k; i++) {
            if (A < B && B < C) {
                break;
            }
            if (B > C) {
                C = 2 * C;
            } else {
                B = 2 * B;
            }
        }
        if (A < B && B < C) {
            prnt.println("Yes");
        } else {
            prnt.println("No");
        }
        prnt.close();
    }
}
