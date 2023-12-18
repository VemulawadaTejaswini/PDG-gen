import java.util.*;

class Node {
    public int key;
    public Node next, pre;
    Node(int key) {
        this.key = key;
        next = pre = null;
    }
}

public class Main {
    public static Node head,last;

    public static void init() {
        head = new Node(0);
        last = new Node(0);
        head.next = last;
        last.pre = head;
        head.pre = head;
        last.next = last;
    }

    public static void insert(Node s, int key) {
        Node node = new Node(key);
        Node t = s.next;
        node.pre = s;
        node.next = t;
        s.next = node;
        t.pre = node;
    }

    public static void delete(Node p) {
        Node s = p.pre;
        Node t = p.next;
        s.next = t;
        t.pre = s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        init();
        while(N-- > 0) {
            if(!scan.hasNext()) break;
            String ope = scan.next();
            if(ope.equals("insert")) {
                insert(head, scan.nextInt());
            } else if(ope.equals("delete")) {
                int num = scan.nextInt();
                for(Node p = head.next; p != last; p = p.next) {
                    if(p.key == num) {
                        delete(p);
                        break;
                    }
                }
            } else if(ope.equals("deleteFirst")) {
                delete(head.next);
            } else if(ope.equals("deleteLast")) {
                delete(last.pre);
            }
        }
        for(Node p = head.next; p != last; p = p.next) {
            if(p != head.next) System.out.print(" ");
            System.out.print(p.key);
        }
        System.out.println();
    }
}