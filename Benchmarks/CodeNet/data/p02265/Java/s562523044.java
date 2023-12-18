import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 效率优于 Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList test = new LinkedList();

        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "insert":
                    test.insert(Integer.parseInt(cmd[1]));
                    break;
                case "delete":
                    test.delete(Integer.parseInt(cmd[1]));
                    break;
                case "deleteFirst":
                    test.deleteFirst();
                    break;
                case "deleteLast":
                    test.deleteLast();
                    break;
            }
        }

        test.printList();
    }
}

class Node {
    public int key;
    public Node prev, next;

    public Node() {
        this.prev = this;
        this.next = this;
    }

    public Node(int key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}

class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = new Node();
    }

    public void insert(int key) {
        Node x = new Node(key);
        x.next = this.head.next;
        this.head.next.prev = x;
        this.head.next = x;
        x.prev = this.head;
    }

    public void deleteFirst() {
        Node cur = head.next;
        cur.next.prev = head;
        head.next = cur.next;
    }

    public void deleteLast() {
        Node cur = head.prev;
        cur.prev.next = head;
        head.prev = cur.prev;
    }

    public void delete(int key) {
        Node cur = head.next;
        while(cur != head){
            if(cur.key == key){
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                break;
            }
            cur = cur.next;
        }
    }

    public void printList() {
        Node cur = this.head.next;
        if(cur == this.head){
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean format = true;
        while(cur != this.head){
            if(format){
                sb.append(cur.key);
                format = false;
            }else {
                sb.append(" " + cur.key);
            }
            cur = cur.next;
        }
        System.out.println(sb);
    }
}
