

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Deque<String> list = new ArrayDeque<String>();

    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = new String[2];
        try {
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
            if (!list.isEmpty()) {
                ans.append(list.getFirst());
                list.removeFirst();
            }
            while (!list.isEmpty()) {
                ans.append(" ").append(list.getFirst());
                list.removeFirst();
            }
            System.out.println(ans.toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

