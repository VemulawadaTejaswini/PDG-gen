import java.io.*;

/**
 * Created by Ayushi on 21 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        if (a.equals(a.toUpperCase())) System.out.println("A");
        else System.out.println("a");
    }
}
