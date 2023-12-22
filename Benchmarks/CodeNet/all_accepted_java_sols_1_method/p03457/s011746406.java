import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int t;
        int x;
        int y;
        int nt = 0;
        int nx = 0;
        int ny = 0;
        int dist;
        int time;
        boolean successFlg = true;
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < N; i++) {

            t = Integer.parseInt(sc.next());
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            time = t - nt;
            dist = Math.abs(x - nx) + Math.abs(y - ny);

            if (dist > time || (time - dist) % 2 != 0) {
                successFlg = false;
            }

            nt = t;
            nx = x;
            ny = y;
        }

        if (successFlg) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        sc.close();
        out.flush();
    }
}