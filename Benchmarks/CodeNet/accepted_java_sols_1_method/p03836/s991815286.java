import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    static final char U = 'U';
    static final char D = 'D';
    static final char L = 'L';
    static final char R = 'R';

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int sx = Integer.parseInt(sl[0]);
        int sy = Integer.parseInt(sl[1]);
        int tx = Integer.parseInt(sl[2]);
        int ty = Integer.parseInt(sl[3]);

        // 4 * ((tx - sx) + (ty - sy)) + 6
        for (int i = 0; i < ty - sy; i++) out.print(U);
        for (int i = 0; i < tx - sx; i++) out.print(R);
        for (int i = 0; i < ty - sy; i++) out.print(D);
        for (int i = 0; i < tx - sx; i++) out.print(L);
        out.print(L);
        for (int i = 0; i <= ty - sy; i++) out.print(U);
        for (int i = 0; i <= tx - sx; i++) out.print(R);
        out.print(D);
        out.print(R);
        for (int i = 0; i <= ty - sy; i++) out.print(D);
        for (int i = 0; i <= tx - sx; i++) out.print(L);
        out.println(U);

        out.flush();
    }
}
