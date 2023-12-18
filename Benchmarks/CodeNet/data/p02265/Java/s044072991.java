
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static class Node {
        Node prev, next;
        int value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        nil.next = nil;
        nil.prev = nil;

        List<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            String s = scan.next();

            if (s.equals("delete")) {
                int x = scan.nextInt();
//                delete(x);
                l.remove((Object) x);
            } else if (s.equals("insert")) {
                int x = scan.nextInt();
//                insert(x);
                l.add(0,x);
            } else if (s.equals("deleteFirst")) {
//                deleteFirst();
                l.remove(0);
            } else if (s.equals("deleteLast")) {
//                deleteLast();
                l.remove(l.size() - 1);
            }
        }

//        Node nn = nil.next;
//        while (nn != nil) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
        }
//        }
        System.out.println();
    }

    static void insert(int x) {
        Node n = new Node();
        Node next = nil.next;

        nil.next = n;
        n.next = next;
        n.prev = nil;
        next.prev = n;
        n.value = x;
    }

    static void delete(int x) {
        Node n = nil.next;
        while (n != nil && n.value != x) {
            n = n.next;
        }
        if (n == nil) {
            return;
        }
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    static void deleteFirst() {
        Node next = nil.next.next;
        nil.next = next;
        next.prev = nil;
    }

    static void deleteLast() {
        Node n = nil.next;
        while (n.next != nil && n != nil) {
            n = n.next;
        }
        Node prev = n.prev;
        prev.next = nil;
        nil.prev = prev;
    }

    static Node nil = new Node();

}


