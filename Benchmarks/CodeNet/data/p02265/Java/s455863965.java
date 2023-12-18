import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n, idx, len;
        String s;
        LinkedList<Integer> list = new LinkedList<Integer>();
        StringBuilder out = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());

        len = 0;
        for (int i = 0; i < n; i++) {
            s = sc.next();

            switch (s.charAt(0)) {
                case 'i':
                    list.addFirst(Integer.parseInt(sc.next()));
                    len++;
                    break;
                case 'd':
                    if (s.length() == 6) {
                        idx = list.indexOf(Integer.parseInt(sc.next()));
                    } else if (s.charAt(6) == 'F') {
                        idx = 0;
                    } else {
                        idx = len - 1;
                    }

                    if (idx >= 0) {
                        list.remove(idx);
                        len--;
                    }

                    break;
                // case "deleteFirst":
                //     list.remove(0);
                //     len--;
                //     break;
                // case "deleteLast":
                //     list.remove(len - 1);
                //     len--;
                //     break;
            }
        }

        len = list.size();
        idx = 0;
        for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
            if (idx == len - 1) {
                out.append(it.next());
            } else {
                out.append(it.next()).append(" ");
            }
            idx++;
        }
        System.out.println(out);
    }
}