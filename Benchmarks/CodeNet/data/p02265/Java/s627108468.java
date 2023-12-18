import java.util.*;

class Cell {
  private int data;
  private Cell next;
  private Cell prev;

  public Cell(int x) {
    this.data = x;
  }
  public void setNext(Cell next) {
    this.next = next;
  }
  public Cell getNext() {
    return this.next;
  }
  public void setPrev(Cell prev) {
    this.prev = prev;
  }
  public Cell getPrev() {
    return this.prev;
  }
  public int getData() {
    return this.data;
  }
}

class DLinkedList {
  private Cell dummy;

  public DLinkedList() {
    this.dummy = new Cell(0);
    this.dummy.setNext(dummy);
    this.dummy.setPrev(dummy);
  }
  public Cell getDummy() {
    return this.dummy;
  }
  public void insert(int data) {
    Cell c = new Cell(data);
    c.setNext(dummy.getNext());
    c.setPrev(dummy);
    dummy.getNext().setPrev(c);
    dummy.setNext(c);
  }
  public Cell search(int data) {
    Cell c = dummy.getNext();
    int a = c.getData();
    while(a != data) {
      c = c.getNext();
      a = c.getData();
    }
    return c;
  }
  public void delete(int data) {
    Cell c = search(data);
    c.getNext().setPrev(c.getPrev());
    c.getPrev().setNext(c.getNext());
  }
  public void deleteFirst() {
    dummy.getNext().getNext().setPrev(dummy);
    dummy.setNext(dummy.getNext().getNext());
  }
  public void deleteLast() {
    dummy.getPrev().getPrev().setNext(dummy);
    dummy.setNext(dummy.getPrev().getPrev());
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DLinkedList dlist = new DLinkedList();
    int n = sc.nextInt();
    String s = "";
    int l = 0;
    for(int i = 0; i < n; i++) {
      s = sc.next();
      if(s.equals("insert")) {
        l = sc.nextInt();
        dlist.insert(l);
      } else if(s.equals("delete")) {
        l = sc.nextInt();
        dlist.delete(l);
      } else if(s.equals("deleteFirst")) {
        dlist.deleteFirst();
      } else {
        dlist.deleteLast();
      }
    }
    Cell dummy = dlist.getDummy();
    for(Cell c = dummy.getNext(); c != dummy; c = c.getNext()) {
      if(c.getNext() == dummy) {
        System.out.println(c.getData());
      } else {
        System.out.print(c.getData() + " ");
      }
    }
  }
}

