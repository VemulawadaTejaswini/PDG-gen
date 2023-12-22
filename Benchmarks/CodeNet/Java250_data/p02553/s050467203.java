import java.io.*;
import java.util.*;

import static java.lang.Long.parseLong;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(in.readLine());
        long a = parseLong(st.nextToken()), b = parseLong(st.nextToken());
        long c = parseLong(st.nextToken()), d = parseLong(st.nextToken());

        pw.println(solve(a,b,c,d));
        pw.close();

    }

    static long solve(long a, long b, long c, long d) {
        ArrayList<Long> list = new ArrayList<>();

        list.add((a * c));
        list.add((b * d));
        list.add((a * d));
        list.add((b * c));

        return Collections.max(list);
    }
}