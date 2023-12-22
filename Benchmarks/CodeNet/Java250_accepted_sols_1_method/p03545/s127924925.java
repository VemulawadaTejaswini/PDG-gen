import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    static final int MAX_NUM = 4;
    static final int B = 8;
     static final int TARGET = 7;

    static int[] num = new int [MAX_NUM];
    static char[] op = new char[MAX_NUM - 1];

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < s.length(); i++)
            num[i] = s.charAt(i) - '0';

        for (int i = 0; i < B; i++) {
            int tmp = num[0];

            for (int j = 0; j < MAX_NUM - 1; j++) {
                op[j] = '+';

                if ((i >> j & 1) == 1) {
                    op[j] = '-';
                    tmp -= num[j + 1];
                } else tmp += num[j + 1];
            }

            boolean flg = false;

            if (tmp == TARGET) {
                for (i = 0; i < MAX_NUM; i++) {
                    out.print(num[i]);

                    if (i == MAX_NUM - 1) {
                        flg = true;
                        break;
                    }

                    out.print(op[i]);
                }
            }

            if (flg) break;
        }

        out.println("=" + String.valueOf(TARGET));

        out.flush();
    }
}
