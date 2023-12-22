import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(System.out);

        char[] n = in.next().toCharArray();
        for (int i = 1; i < n.length; i++) {
            if (n[i] == n[i - 1]) {
                out.println ("Bad");
                out.close();
                System.exit(0);
            }
        }
        out.println("Good");
        out.close();
    }
}