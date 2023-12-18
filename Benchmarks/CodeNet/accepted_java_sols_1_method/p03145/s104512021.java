import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.TreeSet;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int AB = Integer.parseInt(sl[0]);
        int BC = Integer.parseInt(sl[1]);
        int CA = Integer.parseInt(sl[2]);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(AB);
        ts.add(BC);
        ts.add(CA);

        int ans = 1;
        int cnt = 1;
        for (Integer i : ts) {
            if (2 < cnt) break;
            ans *= i;
            cnt++;
        }

        out.println(ans / 2);

        out.flush();
    }
}
