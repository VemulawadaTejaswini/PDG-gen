import java.util.Scanner;

class Cell{
  int key;
  Cell prev, next;
  Cell(int key, Cell prev, Cell next){
    this.key = key;
    this.prev = prev;
    this.next = next;
  }
}

class List{
  Cell head;

  List(){
    head = null;
  }

  void insert(int x){
    head = new Cell(x, null, head);
    if(head.next != null)
      head.next.prev = head;
  }

  void delete(int x){
    Cell cell = head;
    while(cell != null){
      if(cell.key == x){
        cell.prev.next = cell.next;
        break;
      }
      else
        cell = cell.next;
    }
  }

  void deleteFirst(){
    head = head.next;
  }

  void deleteLast(){
    Cell cell = head;
    while(cell.next != null)
      cell = cell.next;
    cell = null;
  }

  void printList(){
    Cell cell = head;
    while(cell.next != null){
      System.out.print(cell.key + " ");
      cell = cell.next;
    }
    System.out.println(cell.key);
  }

}

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    List list = new List();

    for(int i = 0; i < n; i++){
      String order = stdIn.next();
      int x = stdIn.nextInt();
      if(order.equals("insert"))
        list.insert(x);
      else if(order.equals("delete"))
        list.delete(x);
      else if(order.equals("deleteFirst"))
        list.deleteFirst();
      else if(order.equals("deleteLast"))
        list.deleteLast();
    }

    list.printList();

  }
}