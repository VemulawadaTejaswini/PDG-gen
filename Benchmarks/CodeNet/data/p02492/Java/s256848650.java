import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      int x = scan.nextInt();
      String op = scan.next();
      int y = scan.nextInt();
      if(op.equals("?")) break;
      if(op.equals("+")) System.out.println(x+y);
      else if(op.equals("-")) System.out.println(x-y);
      else if(op.equals("*")) System.out.println(x*y);
      else System.out.println(x/y);
    }
  }
}