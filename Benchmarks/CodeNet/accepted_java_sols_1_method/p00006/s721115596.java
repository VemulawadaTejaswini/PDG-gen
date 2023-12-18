import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String revLine;
        while ((line = in.readLine()) != null) {
            revLine = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                revLine = revLine + line.charAt(i);
            }
            System.out.println(revLine);
        }
    }

}