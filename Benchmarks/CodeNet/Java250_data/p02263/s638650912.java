import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Stack<String> stack = new Stack<String>();
    String s;
    
    while (in.hasNext()) {
      s = in.next();
      if (s.equals("+")) {
        int x = Integer.parseInt(stack.pop());
        int y = Integer.parseInt(stack.pop());
        stack.push(Integer.toString(y + x));
      }
      else if (s.equals("-")) {
        int x = Integer.parseInt(stack.pop());
        int y = Integer.parseInt(stack.pop());
        stack.push(Integer.toString(y - x));
      }
      else if (s.equals("*")) {
        int x = Integer.parseInt(stack.pop());
        int y = Integer.parseInt(stack.pop());
        stack.push(Integer.toString(y * x));
      }
      else {
        int num = Integer.parseInt(s);
        stack.push(Integer.toString(num));
      }
    }
    System.out.println(stack.pop());
  }
}

class Stack<Item> {
  private Node first = null;
  
  private class Node {
    Item item;
    Node next;
  }
  
  public boolean isEmpty() { return first == null; }
  
  public void push(Item item) {
    Node oldfirst = first;
    first = new Node();
    first.item = item;
    first.next = oldfirst;
  }
  
  public Item pop() {
    Item item = first.item;
    first = first.next;
    return item;
  }
}