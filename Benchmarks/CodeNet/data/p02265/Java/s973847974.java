import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < n; i++) {
            String c = scanner.next();
            if ("insert".equals(c)) {
                list.insert(scanner.nextInt());
            } else if ("delete".equals(c)) {
                list.delete(scanner.nextInt());
            } else if ("deleteFirst".equals(c)) {
                list.deleteFirst();
            } else {
                list.deleteLast();
            }
        }
        list.print();
    }

    private static class DoublyLinkedList {
        private static class Node {
            int i;
            Node next;
            Node prev;

            private Node(int i) {
                this.i = i;
            }
        }

        Node first;
        Node last;

        private void insert(int i) {
            Node node = new Node(i);
            if (first != null) {
                first.prev = node;
                node.next = first;
            }
            first = node;
            if (last == null) {
                last = node;
            }
        }

        private void delete(int i) {
            Node node = first;
            while (node != null) {
                if (node.i == i) {
                    if (node.prev != null && node.next != null) {
                        node.prev.next = node.next;
                        node.next.prev = node.prev;
                    } else if (node.prev != null) {
                        deleteLast();
                    } else if (node.next != null) {
                        deleteFirst();
                    } else {
                        first = last = null;
                    }
                    break;
                }
                node = node.next;
            }
        }

        private void deleteFirst() {
            if (first.next != null) {
                first.next.prev = null;
                first = first.next;
            } else {
                first = last = null;
            }
        }

        private void deleteLast() {
            if (last.prev != null) {
                last.prev.next = null;
                last = last.prev;
            } else {
                first = last = null;
            }
        }

        private void print() {
            Node node = first;
            while (node != null) {
                System.out.print(node.i);
                if (node.next != null) {
                    System.out.print(" ");
                }
                node = node.next;
            }
            System.out.println("");
        }
    }
}