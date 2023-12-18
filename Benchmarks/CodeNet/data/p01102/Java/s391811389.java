import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.nextLine();
        while (!".".equals(s)) {
            //System.out.println("GET: " + s);
            String t = in.nextLine();

            if (s.equals(t)) {
                out.println("IDENTICAL");
                s = in.nextLine();
                continue;
            }

            List<String> st = parse(s, false), tt = parse(t, false), sk = parse(s, true), tk = parse(t, true);
            if (!sk.equals(tk) || st.size() != tt.size()) {
                out.println("DIFFERENT");
                s = in.nextLine();
                continue;
            }

            int cnt = 0;
            for (int i = 0; i < st.size(); i++) {
                if (!st.get(i).equals(tt.get(i))) cnt++;
            }

            out.println(cnt == 0 ? "IDENTICAL" : cnt == 1 ? "CLOSE" : "DIFFERENT");


            s = in.nextLine();
        }
        out.flush();
    }

    private static List<String> parse(String s, boolean init) {
        List<String> res = new ArrayList<>();
        boolean q = init;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '"') {
                if (q) {
                    res.add(sb.toString());
                    q = false;
                } else {
                    sb.setLength(0);
                    q = true;
                }
            } else if (q) {
                sb.append(c);
            }
        }
        if (q) {
            res.add(sb.toString());
        }
        return res;
    }

}

