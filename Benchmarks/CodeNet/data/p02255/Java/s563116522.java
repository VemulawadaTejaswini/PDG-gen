
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] raw = new int[n];

        // 初回
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            out.append(Integer.toString(tmp));
            // System.out.print(tmp);
            if (i != n - 1) {
                // System.out.print(" ");
                out.append(" ");
            }
            raw[i] = tmp;
        }
        out.append("\n");


        for (int i = 1; i < n; i++) {
            int key = raw[i];
            int j = i - 1;

            while (j >= 0 && raw[j] > key) {
                raw[j + 1] = raw[j];
                j--;
            }
            raw[j + 1] = key;

            for (int k = 0; k < n; k++) {
                out.append(Integer.toString(raw[k]));
                // System.out.print(raw[k]);
                if (k != n - 1) {
                    //System.out.print(" ");
                    out.append(" ");
                }
            }
            
                //System.out.print("\n");
                out.append("\n");
            
        }

        out.flush();

    }
}

