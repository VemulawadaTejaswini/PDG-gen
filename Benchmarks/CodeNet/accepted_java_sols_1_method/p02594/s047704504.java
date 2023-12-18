import java.io.*;

import static java.lang.Integer.*;

public class Main {
    static PrintWriter prnt = new PrintWriter(System.out);
    static BufferedReader read;

    public static void main(String[] args) throws IOException {
        read = new BufferedReader(new InputStreamReader(System.in));

        int x = parseInt(read.readLine());

        if (x >= 30){
            prnt.println("Yes");
        } else {
            prnt.println("No");
        }
        prnt.close();
    }
}
