import java.io.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String revLine;

        // ab = gcd * lcm
        while ((line = in.readLine()) != null) {
            revLine = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                revLine = revLine + line.charAt(i);
            }
            System.out.println(revLine);
        }
    }
}