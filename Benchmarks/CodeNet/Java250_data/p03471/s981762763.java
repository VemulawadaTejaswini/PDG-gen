import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int y = sc.nextInt();

        int c10000 = 2000;
        int c5000 = 2000;
        int c1000 = 0;

        label:
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=n; j++) {
                if ((9000*i+4000*j)==(y-1000*n)) {
                    c10000 = i;
                    c5000 = j;
                    if (c10000+c5000<=n) break label;
                }
            }
        }

        c1000 = n-c10000-c5000;

//        out.print(c10000+" ");
//        out.print(c5000+" ");
//        out.print(c1000+" ");

        if (c1000>=0) {
            out.print(c10000+" ");
            out.print(c5000+" ");
            out.print(c1000+" ");
            out.flush();
        } else {
            out.print(-1+" ");
            out.print(-1+" ");
            out.print(-1+" ");
            out.flush();
        }



    }

}
