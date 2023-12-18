import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n, idx, len;
        String s;
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

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

        for (int i = 0; i < len - 1; i++) {
            System.out.print(list.get(0) + " ");
            list.remove(0);
        }
        System.out.println(list.get(0));

    }
}