import java.io.*;

/**
 * Created by Ayushi on 17 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();
        System.out.print(s.substring(0, Math.min(s.length(), k)));
        if (s.length() > k) System.out.println("...");
        else System.out.println();
    }
}
