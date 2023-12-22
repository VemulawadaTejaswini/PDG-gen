import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        StringTokenizer st;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);

        String num = read.readLine();

        if (num.charAt(0) == '7') {
            prnt.println("Yes");
        } else if (num.charAt(1) == '7') {
            prnt.println("Yes");
        } else if (num.charAt(2) == '7') {
            prnt.println("Yes");
        } else {
            prnt.println("No");
        }
        prnt.close();

    }

}