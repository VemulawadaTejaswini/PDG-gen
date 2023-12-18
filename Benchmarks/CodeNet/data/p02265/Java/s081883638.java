import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "insert":
                    list.insert(sc.nextInt());
                    break;
                case "delete":
                    list.delete(sc.nextInt());
                    break;
                case "deleteFirst":
                    list.deleteFirst();
                    break;
                case "deleteLast":
                    list.deleteLast();
                    break;
            }
        }
        list.show();
    }
}

class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    
    public void insert(T t) {
        Node<T> n = new Node<>(t);
        if (head != null) {
            n.next = head;
            head.prev = n;
        }
        if (tail == null) {
            tail = n;
        }
        head = n;
    }
    
    public void delete(T t) {
        Node<T> n = head;
        while (n != null) {
            if (n.getElem() == t) {
                if (n.prev != null) {
                    n.prev.next = n.next;
                } else {
                    head = n.next;
                }
                if (n.next != null) {
                    n.next.prev = n.prev;
                } else {
                    tail = n.prev;
                }
                break;
            }
            n = n.next;
        }
    }
    
    public void deleteFirst() {
        if (head != null) {
            Node<T> next = head.next;
            if (next != null) next.prev = null;
            head = next;
        }
    }

    public void deleteLast() {
        if (tail != null) {
            Node<T> prev = tail.prev;
            if (prev != null) prev.next = null;
            tail = prev;
        }
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void show() {
        Node<T> n = head;
        StringBuilder sb = new StringBuilder();
        while (n != null) {
            sb.append(n.getElem()).append(" ");
            n = n.next;
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb);
    }
}

class Node<T> {
    T elem;
    Node<T> prev;
    Node<T> next;
    public Node(T t) { elem = t; }
    public T getElem() { return elem; }
}

class Pair<K, V> {
    K k;
    V v;
    public K getKey() { return k; }
    public void setKey(K k) { this.k = k; }
    public V getValue() { return v; }
    public void setValue(V v) { this.v = v; }
    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
}