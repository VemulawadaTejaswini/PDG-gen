import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i = 0;
        try {
            while (i < 50 && (str = br.readLine()) != null) {
                String[] s = str.split(" ", 0);
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                int a = x;
                int b = y;
                if (0 < x && 0 < y && x < 2000000001 && y < 2000000001) {
                    if (x < y) {
                        int z = x;
                        x = y;
                        y = z;
                    }
                    while (y > 0) {
                        int r = x % y;
                        x = y;
                        y = r;
                    }
                    int G = x;
                    int aa = a/G;
                    int bb = b/G;
                    int L = aa*bb*G;
                    System.out.println(G + " " + L);
                    i++;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}