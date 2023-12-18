import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        while (true) {
            String s1 = in.nextLine();
            if (!in.hasNextLine() || s1.equals("."))
                break;
            String s2 = in.nextLine();

            Map.Entry<List<String>, List<String>> strings1 = parseStrings(s1);
            Map.Entry<List<String>, List<String>> strings2 = parseStrings(s2);
            List<String> outer1 = strings1.getKey();
            List<String> outer2 = strings2.getKey();
            List<String> inner1 = strings1.getValue();
            List<String> inner2 = strings2.getValue();

            int diff = 0;
            if (outer1.size() == outer2.size() && inner1.size() == inner2.size()) {
                for (int i=0; i < inner1.size(); i++) {
                    if (!inner1.get(i).equals(inner2.get(i))) {
                        diff++;
                        if (diff > 1)
                            break;
                    }
                }
                for (int i=0; i < strings1.getKey().size(); i++) {
                    if (!outer1.get(i).equals(outer2.get(i))) {
                        diff = 2;
                        break;
                    }
                }
            } else
                diff = 2;

            out.println(diff == 0 ? "IDENTICAL" : diff == 1 ? "CLOSE" : "DIFFERENT");
        }
    }

    private static Map.Entry<List<String>, List<String>> parseStrings(String s) {
        List<String> inner = new ArrayList<>();
        List<String> outer = new ArrayList<>();
        char[] cs = s.toCharArray();
        boolean inside = false;
        int beginIndex = 0;
        for (int i=0; i < cs.length; i++) {
            if (cs[i] == '"') {
                inside = !inside;

                if (inside) {
                    outer.add(s.substring(beginIndex, i));
                    beginIndex = i + 1;
                } else {
                    inner.add(s.substring(beginIndex, i));
                    beginIndex = i + 1;
                }
            }
        }

        outer.add(s.substring(beginIndex));

        return new AbstractMap.SimpleEntry<>(outer, inner);
    }
}

