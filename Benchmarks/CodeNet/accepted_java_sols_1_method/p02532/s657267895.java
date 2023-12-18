import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<LinkedList<String>> l = new ArrayList<LinkedList<String>>(n);
        for (int i = 0; i < n; i++) {
            l.add(i, new LinkedList<String>());
        }
        while (true) {
            String o = sc.next();
            if (o.equals("push")) {
                l.get(sc.nextInt() - 1).push(sc.next());
            } else if (o.equals("pop")) {
                System.out.println(l.get(sc.nextInt() - 1).pop());

            } else if (o.equals("move")) {
                int f = sc.nextInt() - 1;
                int t = sc.nextInt() - 1;
                l.get(t).push(l.get(f).pop());
            } else {
                break;
            }
        }
    }
}