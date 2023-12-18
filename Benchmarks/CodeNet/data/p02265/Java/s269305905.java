import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

class Main {
    static Node nil = new Node();

    static class Node {
        Integer key;
        Node next;
        Node prev;
    }

    static void insert(Integer key) {
        Node n = new Node();
        n.key = key;
        n.next = nil.next;
        nil.next = nil.next.prev = n;
        n.prev = nil;
    }

    static void delete(Integer key) {
        for (Node n = nil.next; n != nil; n = n.next) {
            if (n.key.equals(key)) {
                n.prev.next = n.next;
                n.next.prev = n.prev;
                return;
            }
        }
    }

    static void deleteFirst() {
        nil.next = nil.next.next;
        nil.next.prev = nil;
    }

    static void deleteLast() {
        nil.prev.prev.next = nil;
        nil.prev = nil.prev.prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nil.prev = nil.next = nil;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] command = sc.next().toCharArray();
            switch(command[0]) {
            case 'i':
                  insert(sc.nextInt());
                  break;
            default :
                switch(command.length) {
                case 6:
                    delete(sc.nextInt());
                    break;
                case 11:
                    deleteFirst();
                    break;
                case 10:
                    deleteLast();
                    break;
                }
            }
        }

        LinkedList<String> keys = new LinkedList<>();;
        for (Node node = nil.next; node != nil; node = node.next) {
            keys.add(node.key.toString());
        }
        System.out.println(String.join(" ", keys));

    }
}

