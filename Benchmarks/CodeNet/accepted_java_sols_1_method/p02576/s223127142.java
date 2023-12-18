import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int N = parseInt(st.nextToken()), X = parseInt(st.nextToken()), T = parseInt(st.nextToken());
        int D = N / X;
        if (N % X != 0) {
            D += 1;
        }
        prnt.println(D * T);
        prnt.close();
    }
}