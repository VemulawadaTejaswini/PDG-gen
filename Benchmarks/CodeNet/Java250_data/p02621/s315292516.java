import java.io.*;

/**
 * Created by Ayushi on 27 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        long b = (long) (a + (Math.pow(a, 2)) + (Math.pow(a, 3)));
        System.out.println(b);
    }
}
