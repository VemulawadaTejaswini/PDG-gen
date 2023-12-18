import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Node<T> {
    final T key;
    Node<T> next, prev;

    Node(T t) {
        key = t;
    }
}

class DoublyLinkedList<T> {
    final Node<T> head;
    int size = 0;

    DoublyLinkedList() {
        head = new Node<>(null);
        head.next = head;
        head.prev = head;
    }

    void insert(T x) {
        Node<T> node = new Node<>(x);

        node.next = head.next;
        head.next.prev = node;

        head.next = node;
        node.prev = head;
        size++;
    }

    Node<T> search(T x) {
        Node<T> curr = head.next;
        Node<T> ret = null;
        while (true) {
            if (curr == null || curr.key == null || ret != null) break;
            if (curr.key == x) ret = curr;
            curr = curr.next;
        }
        return ret;
    }

    void deleteNode(Node<T> node) {
        if (node == null) return;

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    void delete(T x) {
        deleteNode(search(x));
    }

    void deleteFirst() {
        deleteNode(head.next);
    }

    void deleteLast() {
        deleteNode(head.prev);
    }

    void printList() {
        Node<T> curr = head.next;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(curr.key);
            if (i < size - 1) {
                sb.append(" ");
            }
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }
}


public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
//            DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
            Deque<Integer> ll = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                String command = line[0];
                switch (command) {
                    case "insert": {
                        Integer x = Integer.parseInt(line[1]);
                        ll.addFirst(x);
                        break;
                    }
                    case "delete": {
                        Integer x = Integer.parseInt(line[1]);
                        ll.remove(x);
                        break;
                    }
                    case "deleteFirst":
                        ll.removeFirst();
                        break;
                    case "deleteLast":
                        ll.removeLast();
                        break;
                    default:
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            int size = ll.size();
            int cnt = 0;
            for (Integer i : ll) {
                sb.append(i);
                if (cnt < size - 1) sb.append(" ");
                cnt++;
            }
            System.out.println(sb.toString());
//            ll.printList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
