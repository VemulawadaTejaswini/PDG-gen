import java.util.*;
public class Main{
  public static void main (String[] args)throws java.lang.Exception{
    Scanner scanner = new Scanner(System.in);
    while(true){
      int a = scanner.nextInt();
      String d = scanner.next();
      int b = scanner.nextInt();
      if(d.equals("?")){
        break;
      }
      if(d.equals("+")){
        System.out.println(a+b);
      }
      if(d.equals("-")){
        System.out.println(a-b);
      }
      if(d.equals("*")){
        System.out.println(a*b);
      }
      if(d.equals  ("/")){
        System.out.println(a/b);
      }
    }
  }
}