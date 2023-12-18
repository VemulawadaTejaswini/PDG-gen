import java.io.*;

/**
 * Created by Ayushi on 07/07/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int a = Integer.parseInt(temp[1]);
        int b = Integer.parseInt(temp[2]);
        r.close();

        System.out.println(Math.min((n*a), b));
    }
}
