import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String[] str = s.split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            if (x == 0 && y == 0) {
                break;
            }
            if (x < y) {
                System.out.println(x + " " + y);
            } else {
                System.out.println(y + " " + x);
            }
        }
    }
}
