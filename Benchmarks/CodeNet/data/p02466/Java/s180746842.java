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
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            if (a.contains(tmp)) a.remove(tmp);
            else a.add(tmp);
        }

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

