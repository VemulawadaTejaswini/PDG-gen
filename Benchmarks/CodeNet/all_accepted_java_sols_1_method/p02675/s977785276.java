import java.io.*;

/**
 * Created by Ayushi on 17 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();

        if (a.endsWith("0") || a.endsWith("1") || a.endsWith("6") || a.endsWith("8")) {
            System.out.println("pon");
        }
        else if (a.endsWith("3")) {
            System.out.println("bon");
        }
        else {
            System.out.println("hon");
        }
    }
}
