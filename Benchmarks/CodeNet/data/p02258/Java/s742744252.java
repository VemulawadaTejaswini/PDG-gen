import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt(r);
        
        if (n <= 1) {
            output(-1);
            return;
        } else {
            int r_i = readInt(r);
            int r_j = readInt(r);
            int delta = r_j - r_i;
            int maxDelta = delta;
            
            if (r_i > r_j) {
                r_i = r_j;
            }

            for (int i = 0;i < (n -2);i++) {
                r_j = readInt(r);
                delta = r_j - r_i;
                if (delta > maxDelta) {
                    maxDelta = delta;
                }

                if (r_i > r_j) {
                    r_i = r_j;
                }
            }
            
            output(maxDelta);
        }
    }

    public static void output(int x) {
        System.out.println(x);
    }

    public static int readInt(BufferedReader r) throws Exception {
        return Integer.parseInt(r.readLine());
    }
}