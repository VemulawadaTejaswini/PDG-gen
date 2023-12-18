import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n;
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");

            switch (s[0]) {
                case "insert":
                    list.addFirst(s[1]);
                    break;
                case "delete":
                    int idx = list.indexOf(s[1]);
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

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));

    }
}