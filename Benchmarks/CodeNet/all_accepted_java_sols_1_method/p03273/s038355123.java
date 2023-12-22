import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        List<String> cm = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            if (s.contains("#")) {
                cm.add(s);
            }
        }
        sc.close();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            boolean f = true;
            for (String x : cm) {
                if (!x.substring(w - i - 1, w - i).equals("."))
                    f = false;
            }
            if (f) {
                b.add(w - i - 1);
            }
        }
        for (String x : cm) {
            for (int i = 0; i < w; i++) {
                boolean f = true;
                for (int j : b) {
                    if (i == j)
                        f = false;
                }
                if (f)
                    System.out.print(x.substring(i, i + 1));
            }
            System.out.println();
        }
    }
}