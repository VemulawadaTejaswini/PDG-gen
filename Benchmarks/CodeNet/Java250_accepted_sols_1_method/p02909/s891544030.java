import java.io.*;

/**
 * Created by Ayushi on 15/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String in = r.readLine();
        r.close();

        if (in.equals("Sunny")) {
            System.out.println("Cloudy");
        }
        else if (in.equals("Cloudy")) {
            System.out.println("Rainy");
        }
        else {
            System.out.println("Sunny");
        }
    }
}
