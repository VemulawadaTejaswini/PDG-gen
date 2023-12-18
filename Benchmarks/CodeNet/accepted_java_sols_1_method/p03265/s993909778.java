import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 2; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
      
        int dx = x[1] - x[0];
        int dy = y[1] - y[0];
        x[2] = x[1] - dy;
        y[2] = y[1] + dx;
        x[3] = x[2] - dx;
        y[3] = y[2] - dy;

        out.println(x[2] + " " + y[2] + " " + x[3] + " " + y[3]);
        
        out.flush();
    }
}