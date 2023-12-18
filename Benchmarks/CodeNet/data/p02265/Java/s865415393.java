import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

class DoublyLinkedList<T> {
    public Node<T> nil;

    class Node<T> {
        public T key;
        public Node<T> next;
        public Node<T> prev;
    }

    DoublyLinkedList() {
        nil = new Node<T>();
        nil.next = nil;
        nil.prev = nil;
    }

    public void insert(T key) {
        Node<T> n = new Node<>();
        n.key = key;
        n.next = this.nil.next;
        this.nil.next.prev = n;
        this.nil.next = n;
        n.prev = this.nil;
    }

    public void delete(T key) {
        for (Node<T> n = this.nil.next; n != this.nil; n = n.next) {
            if (n.key.equals(key)) {
                n.prev.next = n.next;
                n.next.prev = n.prev;
                return;
            }
        }
    }

    public void deleteFirst() {
        this.nil.next = this.nil.next.next;
        this.nil.next.prev = this.nil;
    }

    public void deleteLast() {
        Node<T> newHead = this.nil.prev.prev;
        newHead.next = this.nil;
        this.nil.prev = newHead;
    }

    public List<T> keys() {
        List<T> keys = new ArrayList<T>();
        for (Node<T> n = this.nil.next; n != this.nil; n = n.next) {
            keys.add(n.key);
        }
        return keys;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList<Integer> L = new DoublyLinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int key;

            switch(command) {
              case "insert" :
                  key = sc.nextInt();
                  L.insert(key);
                  break;
              case "delete" :
                  key = sc.nextInt();
                  L.delete(key);
                  break;
              case "deleteFirst" :
                  L.deleteFirst();
                  break;
              case "deleteLast" :
                  L.deleteLast();
                  break;
            }
        }

    }
}

