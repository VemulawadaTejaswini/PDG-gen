

import java.io.*;
import java.util.*;

public class Main {
    static Deque<String> list = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String sp = br.readLine();
            if (sp.startsWith("insert")) {
                list.addFirst(sp.substring(sp.indexOf(" ") + 1));
            }else if (sp.equals("deleteFirst")) {
                list.removeFirst();
            } else if (sp.equals("deleteLast")) {
                list.removeLast();
            } else if (sp.startsWith("delete")) {
                list.remove(sp.substring(sp.indexOf(" ") + 1));
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        ans.append(list.poll());
        for (String s : list) {
            ans.append(" ");
            ans.append(s);
        }
        bw.write(ans.toString());
        bw.newLine();
        bw.close();
        br.close();
    }
}

