import java.io.*;

/**
 * Created by Ayushi on 20 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println((360/t));
        br.close();
    }
}
