import java.io.*;

/**
 * Created by Ayushi on 03 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        System.out.println(a.equals("ABC")?"ARC":"ABC");
    }
}
