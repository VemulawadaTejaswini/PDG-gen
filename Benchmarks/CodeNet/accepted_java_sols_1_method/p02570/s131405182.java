import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);
        StringTokenizer st;
        st = new StringTokenizer(read.readLine());
        int D = parseInt(st.nextToken()), T = parseInt(st.nextToken()),S = parseInt(st.nextToken());
        if (D <= T * S) {
            prnt.println("Yes");
        } else {
            prnt.println("No");
        }
        prnt.close();
    }
}