

import java.io.*;
import java.util.*;

public class Main {
    static Deque<String> list = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = new String[2];

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sp = br.readLine().split(" ");
            if (sp[0].equals("insert")) {
                list.addFirst(sp[1]);
            } else if (sp[0].equals("delete")) {
                list.remove(sp[1]);
            } else if (sp[0].equals("deleteFirst")) {
                list.removeFirst();
            } else if (sp[0].equals("deleteLast")) {
                list.removeLast();
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

