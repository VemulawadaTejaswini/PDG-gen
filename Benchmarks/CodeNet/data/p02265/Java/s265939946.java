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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Node head = new Node(0);
        Node last = new Node(0);
        head.pre = head;
        head.next = last;
        last.pre = head;
        last.next = last;
        while(N-- > 0) {
            String ope = scan.next();
            if(ope.equals("insert")) {
                int num = scan.nextInt();
                Node node = new Node(num);
                Node s = head;
                Node t = head.next;
                node.pre = s;
                node.next = t;
                s.next = node;
                t.pre = node;
            } else if(ope.equals("delete")) {
                int num = scan.nextInt();
                for(Node p = head.next; p != last; p = p.next) {
                    if(p.key == num) {
                        p.pre.next = p.next;
                        p.next.pre = p.pre;
                        break;
                    }
                }
            } else if(ope.equals("deleteFirst")) {
                Node p = head.next;
                head.next = p.next;
                p.next.pre = head;
            } else if(ope.equals("deleteLast")) {
                Node p = last.pre;
                p.pre.next = last;
                last.pre = p.pre;
            }
        }
        for(Node p = head.next; p != last; p = p.next) {
            if(p != head.next) System.out.print(" ");
            System.out.print(p.key);
        }
        System.out.println();
    }
}