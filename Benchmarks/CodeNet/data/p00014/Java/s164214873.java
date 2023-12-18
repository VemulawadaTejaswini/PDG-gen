
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            System.out.println(f(s));
        }
    }

    public static String f(String s){
        int a = Integer.parseInt(s);
        int sum = 0;
        for (int i = a; i < 600; i+=a) {
            int y = (int)Math.pow(i, 2);
            sum += a * y;
        }
        return String.valueOf(sum);
    }
}