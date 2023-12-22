
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int H = scan.nextInt();
        int M = scan.nextInt();

        double ax = A*Math.cos(Math.toRadians(90-30*H-M/2.0));
        double ay = A*Math.sin(Math.toRadians(90-30*H-M/2.0));
        double bx = B*Math.cos(Math.toRadians(90-6*M));
        double by = B*Math.sin(Math.toRadians(90-6*M));

        double ans = Math.sqrt((ax-bx)*(ax-bx)+(ay-by)*(ay-by));

        os.println(ans);
    }


}