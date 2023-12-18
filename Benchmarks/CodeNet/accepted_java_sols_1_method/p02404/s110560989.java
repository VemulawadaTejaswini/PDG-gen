import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while(true) {
            int H = Integer.parseInt(sc.next());
            int W = Integer.parseInt(sc.next());
            if (H == 0 && W == 0) {
                break;
            }
            for (int i = 0; i < H; i++) {
                String S = "";
                for (int j = 0; j < W; j++) {
                    if ((i == 0 || i + 1 == H) || (j == 0 || j + 1 == W)) {
                        S += "#";
                    } else {
                        S += ".";
                    }
                }
                out.printf("%s\n", S);
            }
            out.printf("\n");
        }
        out.flush();
    }
}
