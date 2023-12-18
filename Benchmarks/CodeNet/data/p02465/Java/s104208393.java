import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int n = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int m = sc.nextInt();
        HashSet<Integer> b = new HashSet<>();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        a.removeAll(b);

        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append("\n");
        }

        PrintWriter out = new PrintWriter(System.out);
        out.print(sb);
        out.flush();
        
        sc.close();
    }
}

