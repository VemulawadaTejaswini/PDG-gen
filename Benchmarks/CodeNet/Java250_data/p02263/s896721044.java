import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws java.lang.NumberFormatException{
    Scanner scan=new Scanner(System.in);
    Deque<Integer> stack=new ArrayDeque<>();

    while(scan.hasNext()){
      String op=scan.next();
      if(isNum(op)){
        stack.addFirst(Integer.parseInt(op));
      }else if(op.equals("+")){
        int x=stack.removeFirst();
        int y=stack.removeFirst();
        stack.addFirst(y+x);
      }else if(op.equals("-")){
        int x=stack.removeFirst();
        int y=stack.removeFirst();
        stack.addFirst(y-x);
      }else if(op.equals("*")){
        int x=stack.removeFirst();
        int y=stack.removeFirst();
        stack.addFirst(y*x);
      }
    }

    System.out.println(stack.removeFirst());
  }
  static boolean isNum(String s){
    try{
      Integer.parseInt(s);
      return true;
    }catch(NumberFormatException e){
      return false;
    }
  }
}
