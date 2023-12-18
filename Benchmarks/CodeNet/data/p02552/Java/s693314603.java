import java.io.*;
import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int x = parseInt(in.readLine());
        if (x == 0) pw.println(1);
        else pw.println(0);
        
        pw.close();

    }
}