import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int g = 0;
            int p = 0;
            int win = 0;
            int loose = 0;

            char[] buf = new char[1];
            while (in.read(buf) == 1) {
                if (buf[0] != 'g' && buf[0] != 'p') {
                    continue;
                }
                char h = buf[0];
                if (g > p) {
                    ++p;
                    if (h == 'g') {
                        ++win;
                    }
                } else {
                    ++g;
                    if (h == 'p') {
                        ++loose;
                    }
                }
            }
            System.out.println(win - loose);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}