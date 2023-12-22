import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n, odd;
    int[] twos;

    Main() {
        n = in.nextInt(); odd = 0;
        twos = new int[2];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a%2 == 0 && a%4 != 0)
                twos[0]++;
            else if (a%4 == 0)
                twos[1]++;
            else if (a%2 == 1)
                odd++;
        }

        int at = 0;
        if (odd <= twos[1] || (odd == twos[1]+1 && twos[0] == 0))
            out.println("Yes");
        else
            out.println("No");
        out.close();
    }
}