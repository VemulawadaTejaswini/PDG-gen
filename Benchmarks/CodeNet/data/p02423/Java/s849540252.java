import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        List<Long> ans = new ArrayList<>();
        ans.add(sc.nextLong());
        ans.add(~ans.get(0));
        ans.add(ans.get(0) << 1);
        ans.add(ans.get(0) >> 1);

        for (int i = 0; i < ans.size(); i++) {
            String s = String.format("%32s", Long.toBinaryString(ans.get(i))).replace(" ", "0");
            String str = s.substring(s.length() - 32, s.length());
            sb.append(str).append("\n");
        }

        PrintWriter out = new PrintWriter(System.out);
        out.print(sb);
        out.flush();
        
        sc.close();
    }
}

