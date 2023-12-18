
import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String name = in.readLine();
        char c[] = name.toCharArray();

        if (c[0] == 'R' && c[1] == 'R') {
            System.out.println(2);
        } else if (c[0] == 'R' && c[1] == 'R' && c[2] == 'R') {
            System.out.println(1);
        } else if (c[0] == 'R' && c[2] == 'R') {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
