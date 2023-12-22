import java.util.*;
import java.io.*;

class Main {
    final private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    final private static StringBuilder sb = new StringBuilder();

    public static void main(final String[] args) throws IOException {
        final String line = in.readLine();
        
        for (int i = line.length() - 1;  0 <= i; --i) {
            sb.append(line.charAt(i));
        }
        System.out.println(sb);
    }
}