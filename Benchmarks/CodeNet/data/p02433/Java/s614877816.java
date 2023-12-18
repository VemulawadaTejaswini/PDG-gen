// ITP2_1_C List
import java.util.Scanner;

class Node {
  int x;
  Node next;
  Node prev;
}

public class Main {
  public static void main(String[] args) {
    Node sentinel = new Node();
    Node curr = sentinel;
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    for (int i = 0; i < q; ++i) {
      switch (sc.nextInt()) {
        case 0: // insert
          Node tmp = new Node();
          tmp.x = sc.nextInt();
          tmp.next = curr;
          tmp.prev = curr.prev;
          if (curr.prev != null) curr.prev.next = tmp;
          curr.prev = tmp;
          curr = tmp;
          break;
        case 1: // seek
          int d = sc.nextInt();
          if (d > 0) {
            while (d != 0 && curr.next != null) {
              curr = curr.next;
              d--;
            }
          } else {
            while (d != 0 && curr.prev != null) {
              curr = curr.prev;
              d++;
            }
          }
          break;
        case 2: // delete
          curr.next.prev = curr.prev;
          if (curr.prev != null) curr.prev.next = curr.next;
          curr = curr.next;
      }
    }
    while (curr.prev != null) curr = curr.prev;
    while (curr != sentinel) {
      System.out.println(curr.x);
      curr = curr.next;
    }
  }
}

