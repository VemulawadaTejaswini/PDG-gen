import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            char[] buf = new char[1];
            boolean c = false;
            boolean f = false;
            while (in.read(buf) == 1) {
                if (buf[0] == 'C') {
                    c = true;
                }
                if (c && buf[0] == 'F') {
                    f = true;
                    break;
                }
            }
            if (c && f) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}