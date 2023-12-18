import java.util.Scanner;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

class Node {
  Node prev;
  Node next;
  int value;

  public Node(int x) {
    this.value = x;
  }
}

class LinkedList {
  Node head;
  Node tail;

  public LinkedList() {
    head = null;
    tail = null;
  }

  public void insert(int x) {
    Node n = new Node(x);
    if (head == null) {
      n.prev = null;
      n.next = null;
      head = n;
      tail = n;
      return;
    }

    n.next = head;
    n.prev = null;

    head.prev = n;
    head = n;
  }

  public boolean deleteFirst() {
    if (head == null) {
      return false;
    }

    if (head == tail) {
      head.prev = null;
      head.next = null;
      head = null;
      tail = null;
      return true;
    }

    // list contains 2 or more elements
    head = head.next;
    head.prev = null;
    return true;
  }

  public boolean deleteLast() {
    if (tail == null) {
      return false;
    }

    if (tail == head) {
      tail.prev = null;
      tail.next = null;
      head = null;
      tail = null;
      return true;
    }

    // list contains 2 or more elements
    tail = tail.prev;
    tail.next = null;
    return true;
  }

  public boolean delete(int x) {
    Node cursor = head;
    while (cursor != null) {
      if (cursor.value == x) {
        if (cursor == head) {
          return deleteFirst();
        } else if (cursor == tail) {
          return deleteLast();
        }
        cursor.prev.next = cursor.next;
        cursor.next.prev = cursor.prev;
        return true;
      }
      cursor = cursor.next;
    }
    return false;
  }

  public void print() {
    StringBuilder buf = new StringBuilder(400000);
    Node cursor = head;
    while (cursor != null) {
      buf.append(cursor.value);
      buf.append(" ");
      cursor = cursor.next;
    }
    System.out.println(buf.toString().trim());
  }


}

public class Main {
  private static int N;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    LinkedList list = new LinkedList();

    for (int i = 0; i < N; i++) {
      String cmd = in.next();
      switch(cmd) {
        case "insert":
          list.insert(in.nextInt());
          break;
        case "delete":
          list.delete(in.nextInt());
          break;
        case "deleteFirst":
          list.deleteFirst();
          break;
        case "deleteLast":
          list.deleteLast();
          break;
        default:
          System.out.println("Error");
          System.exit(1);
      }
    }
    list.print();
  }
}