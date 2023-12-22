import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        final double pi = 3.141592653;
        int r = Integer.parseInt(br.readLine());
        pw.println(2 * pi * r);

        pw.close();
    }
}