
import java.io.*;
import java.util.*;
//import java.util.stream.*;;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(br.readLine());
        StringBuilder b = new StringBuilder(br.readLine());
        StringBuilder c = new StringBuilder(br.readLine());
        String s = "";
        char x = a.charAt(0);
        while (true) {
            if (x == 'a') {
                if (a.length() == 0) {
                    s = "A";
                    break;
                } else {
                    x = a.charAt(0);
                    a.delete(0, 1);
                }
            } else if (x == 'b') {
                if (b.length() == 0) {
                    s = "B";
                    break;
                } else {
                    x = b.charAt(0);
                    b.delete(0, 1);
                }
            } else if (x == 'c') {
                if (c.length() == 0) {
                    s = "C";
                    break;
                } else {
                    x = c.charAt(0);
                    c.delete(0, 1);
                }
            }
        }
        System.out.println(s);
        bw.flush();
    }
}
