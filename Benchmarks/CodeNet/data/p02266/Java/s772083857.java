import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

  class Node {

    int val;
    Node next;

    public Node(int val) {
      this.val = val;
      this.next = null;
    }

  }

  class Stack {

    Node top;

    public Stack() {
      this.top = null;
    }

    public List<Integer> toArrayList() {
      List<Integer> l = new ArrayList<Integer>();
      Node curr = this.top;
      while (curr != null) {
        l.add(curr.val);
        curr = curr.next;
      }
      return l;
    }

    public boolean isEmpty() {
      return this.top == null;
    }

    public void push(int val) {
      Node newElem = new Node(val);
      newElem.next = this.top;
      this.top = newElem;
    }

    public Integer peek() {
      Node top = this.top;
      if (this.top == null)
        return null;
      return top.val;
    }

    public Integer pop() {
      Node top = this.top;
      if (this.top == null)
        return null;
      this.top = this.top.next;
      return top.val;
    }

    public Integer sum() {
      Node top = this.top;
      int sum = 0;
      while (top != null) {
        sum += top.val;
        top = top.next;
      }
      return sum;
    }

    public void display() {
      Node curr = this.top;
      StringBuilder s = new StringBuilder("");
      while (curr != null) {
        s.append(curr.val + " -> ");
        curr = curr.next;
      }
      s.append("null");
      System.out.println(s);
    }

  }

  int totalArea = 0;
  Stack areas = new Stack();
  Stack areas_far_left = new Stack();
  String[] gradients;

  public Main(String[] gradients) {
    this.gradients = gradients;
  }

  public void merge(int left, int right) {
    int new_area = right - left;
    while (this.areas_far_left.peek() != null && left < this.areas_far_left.peek()) {
      new_area += this.areas.pop();
      this.areas_far_left.pop();
    }
    this.areas.push(new_area);
    this.areas_far_left.push(left);
  }

  public void handleDown(Stack s, int i) {
    s.push(i);
  }

  public void handleUp(Stack s, int right) {
    Integer left = s.pop();
    if (left != null)
      this.merge(left, right);
  }

  public void calculateFloods() {
    Stack s = new Stack();
    for (int i = 0; i < gradients.length; i++) {
      switch(gradients[i]) {
        case "/":
          handleUp(s, i);
          break;
        case "\\":
          handleDown(s, i);
          break;
        default:
          break;
      }
    }
  }

  public void displayOutput() {
    int totalArea = this.areas.sum();
    List<Integer> areas = this.areas.toArrayList();
    Collections.reverse(areas);
    StringBuilder s = new StringBuilder(Integer.toString(areas.size()));
    for (int area : areas) {
      s.append(" " + area);
    }
    System.out.println(totalArea);
    System.out.println(s);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] gradients = s.nextLine().split("");
    Main x = new Main(gradients);
    x.calculateFloods();
    x.displayOutput();
    s.close();
  }
}

