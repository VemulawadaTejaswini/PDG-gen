import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        int count = 0;
        if (s.charAt(1) == 'R')
            count = 1 + ((s.charAt(0) == 'R' ? 1 : 0)) + ((s.charAt(2) == 'R' ? 1 : 0));
        else
            count = ((s.charAt(0) == 'R' ? 1 : 0)) | ((s.charAt(2) == 'R' ? 1 : 0));

        pw.println(count);
        pw.close();
    }
}
