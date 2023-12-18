import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------
        String line =f.readLine();
        if(line.matches("[a-z]"))
            out.print(line.toUpperCase());
        else
            {
                out.print(line.toLowerCase());
            }

        out.close();
    }
}