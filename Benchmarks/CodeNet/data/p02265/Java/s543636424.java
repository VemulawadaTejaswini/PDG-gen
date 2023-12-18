import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < c; i++) {
            String op = sc.next();
            switch (op) {
                case "insert":
                    l.addFirst(sc.nextInt());
                    break;
                case "delete":
                    l.removeFirstOccurrence(sc.nextInt());
                    break;
                case "deleteFirst":
                    l.removeFirst();
                    break;
                case "deleteLast":
                    l.removeLast();
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(l.get(i));
        }
        System.out.println(sb);
    }
}