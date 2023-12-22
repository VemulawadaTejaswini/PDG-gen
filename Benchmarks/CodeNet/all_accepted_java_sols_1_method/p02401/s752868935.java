import java.util.*;

public class Main {
  public static void main(String[] args){

    int a,b;
    String op;
    int result=0;
    Scanner sc = new Scanner(System.in);
    while(true){
      a = Integer.parseInt(sc.next());
      op = sc.next();
      b = Integer.parseInt(sc.next());

      if(op.equals("+")){
        result = a + b;
      }else if(op.equals("-")){
        result = a - b;
      }else if(op.equals("*")){
        result = a * b;
      }else if(op.equals("/")){
        result = a / b;
      }else if(op.equals("?")){
        break;
      }
      System.out.println(result);
    }
  }
}

