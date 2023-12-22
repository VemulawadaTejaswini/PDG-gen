import java.io.*;

/**
 * Created by Ayushi on 13 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        System.out.println(s.substring(0, 3));
    }
}
