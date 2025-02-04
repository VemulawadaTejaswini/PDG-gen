
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> list = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String sp = br.readLine();
            if (sp.startsWith("insert")) {
                list.addFirst(Integer.parseInt(sp.substring(sp.indexOf(" ") + 1)));
            } else if (sp.equals("deleteFirst")) {
                list.removeFirst();
            } else if (sp.equals("deleteLast")) {
                list.removeLast();
            } else {
                list.remove(Integer.parseInt(sp.substring(sp.indexOf(" ") + 1)));
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        ans.append(list.poll());
        for (Integer s : list) {
            ans.append(" ");
            ans.append(s);
        }
        bw.write(ans.toString());
        bw.newLine();
        bw.close();
        br.close();
    }
}

