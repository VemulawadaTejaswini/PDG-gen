import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n, idx, len;
        String s;
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());

        for (int i = 0; i < n; i++) {
            s = sc.next();

            switch (s.split(" ")[0]) {
                case "insert":
                    list.addFirst(Integer.parseInt(sc.next()));
                    break;
                case "delete":
                    idx = list.indexOf(Integer.parseInt(sc.next()));
                    if (idx >= 0) list.remove(idx);
                    break;
                case "deleteFirst":
                    list.remove(0);
                    break;
                case "deleteLast":
                    list.remove(list.size() - 1);
                    break;
            }
        }

        len = list.size();
        idx = 0;

        for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
            if (idx == len - 1) {
                System.out.println(it.next());
            } else {
                System.out.print(it.next() + " ");
            }
            idx++;
        }
    }
}