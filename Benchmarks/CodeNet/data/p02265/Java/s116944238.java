import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    MyLinkedList list = new MyLinkedList();
    for (int i = 0; i < n; i++) {
      String command = sc.next();
      switch (command) {
      case "insert":
        list.insert(Integer.parseInt(sc.next()));
        break;
      case "delete":
        list.delete(Integer.parseInt(sc.next()));
        break;
      case "deleteFirst":
        list.deleteFirst();
        break;
      case "deleteLast":
        list.deleteLast();
        break;
      }
    }
    list.print();
  }
}

class Element {
  Element prev, next;
  int value;

  Element(int value) {
    this.value = value;
  }
}

class MyLinkedList {

  Element nil;

  MyLinkedList() {
    nil = new Element(-1);
    nil.next = nil;
    nil.prev = nil;
  }

  void insert(int value) {
    Element element = new Element(value);
    element.next = nil.next;
    nil.next.prev = element;
    nil.next = element;
    element.prev = nil;
  }

  void delete(int value) {
    for (Element e = nil.next; e.value != -1; e = e.next) {
      if (e.value == value) {
        e.prev.next = e.next;
        e.next.prev = e.prev;
        return;
      }
    }
  }

  void deleteFirst() {
    Element element = nil.next;
    nil.next = element.next;
    element.next.prev = nil;
  }

  void deleteLast() {
    Element element = nil.prev;
    nil.prev = element.prev;
    element.prev.next = nil;
  }

  void print() {
    PrintWriter writer = new PrintWriter(System.out);
    for (Element e = nil.next; e.next.value != -1; e = e.next) {
      writer.print(e.value + " ");
    }
    writer.println(nil.prev.value);
    writer.flush();
  }
}
