import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Double x1 = Double.parseDouble(sc.next());
        Double y1 = Double.parseDouble(sc.next());
        Double x2 = Double.parseDouble(sc.next());
        Double y2 = Double.parseDouble(sc.next());

        Double H = y2 - y1;
        Double W = x2 - x1;
        Double dist2 = H * H + W * W;
        out.printf("%.10f\n", Math.sqrt(dist2));
        out.flush();
    }
}
