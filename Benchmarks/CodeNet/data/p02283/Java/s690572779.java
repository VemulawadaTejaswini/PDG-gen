import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    Node parent = null;
    String inputString = reader.readLine();
    while(!inputString.equals("print")) {
      String[] input = inputString.split(" ");
      Node newNode = new Node(Integer.parseInt(input[1]));
      if(parent==null) parent = newNode;
      else parent.insert(newNode);
      inputString = reader.readLine();
    }
    parent.printFirst();
    System.out.println();
    parent.printCenter();
    System.out.println();
  }
}

class Node{
  Node small,large;
  int num;

  Node(int _num) {
    num = _num;
  }

  void insert(Node _node) {
    if(num>_node.num) {
      if(small!=null) small.insert(_node);
      else small = _node;
    }else {
      if(large!=null) large.insert(_node);
      else large = _node;
    }
  }

  void printFirst() {
    if(small!=null) small.printFirst();
    System.out.printf(" %d",num);
    if(large!=null) large.printFirst();
  }

  void printCenter() {
    System.out.printf(" %d",num);
    if(small!=null) small.printFirst();
    if(large!=null) large.printFirst();
  }
}