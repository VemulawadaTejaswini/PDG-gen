import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] line;
      MyList list = new MyList();

      for(int i=0; i<n; i++) {
        line = br.readLine().split(" ");
        switch( line[0] ) {
          case "insert" :
            list.insertFirst( Integer.parseInt(line[1]) );
            break;
          case "delete" :
            list.delete( Integer.parseInt(line[1]) );
            break;
          case "deleteFirst" :
            list.deleteFirst();
            break;
          case "deleteLast" :
            list.deleteLast();
            break;
          default :
            System.out.println("n:" + i + " is failed.");
        }
      }

      System.out.println ( list.getAllElements() );
    }
  }
}

class Node {
  Node next,prev;
  int key;

  public Node(int key) {
    this.key = key;
  }
}

class MyList {
  Node nil;
  Node current;
  int size;

  public MyList() {
    nil = new Node(0);
    nil.next = nil.prev = nil;
    size = 0;
  }

  public StringBuilder getAllElements() {
    StringBuilder buf = new StringBuilder(size*2);

    if(size > 0){
      current = nil.next;
      for(int i=0; i<size; i++){
        buf.append(current.key).append(" ");
        current = current.next;
      }
    }
    buf.setLength(buf.length()-1);

    return buf;
  }
  public void insertFirst(int x) {
    if(size == 0) {
      current = new Node(x);
      nil.next = current;
      nil.prev = current;
      current.prev = nil;
      current.next = nil;
      size++;
    }
    else {
      Node add = new Node(x);
      
      current.prev.next = add;
      add.prev = current.prev;

      add.next = current;
      current.prev = add;

      current = add;
      size++;
    }
  }
  public void deleteFirst() {
    current = nil.next;

    nil.next = current.next;
    current.next.prev = current.prev;

    current = current.next;
    size--;
  }
  public void deleteLast() {
    current = nil.prev;

    nil.prev = current.prev;
    current.prev.next = current.next;

    current = nil.next;
    size--;
  }
  public void delete(int x) {
    Node target = findFirst(x);

    if(target == nil) current = current.next;
    else if( target == nil.prev ) deleteLast();
    else {
      current.prev.next = target.next;
      current.next.prev = target.prev;
      current = nil.next;
      size--;
    }
  }
  private Node findFirst(int x) {
    while(current != nil) {
      if(current.key == x) break;
      current = current.next;
    }

    return current;
  }
}
