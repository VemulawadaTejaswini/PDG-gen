import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> list = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            if (line[0].equals("insert")) {
                list.addFirst(Integer.parseInt(line[1]));
            } else if (line[0].equals("delete")) {
                list.remove(Integer.valueOf(Integer.parseInt(line[1])));
            } else if (line[0].equals("deleteFirst")) {
                list.removeFirst();
            } else {
                list.removeLast();
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        while (list.size() > 0) {
            if (!first) {
                sb.append(" ");
            }
            first = false;
            sb.append(list.poll());
        }
        System.out.println(sb);
    }
}
