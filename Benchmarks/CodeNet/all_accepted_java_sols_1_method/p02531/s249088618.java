import java.util.Scanner;
import java.util.LinkedList;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> l = new LinkedList<String>();
        while (true) {
            String o = sc.next();
            if (o.equals("push")) {
                l.push(sc.next());
            } else if (o.equals("pop")) {
                System.out.println(l.pop());
            } else {
                break;
            }
        }
    }
}