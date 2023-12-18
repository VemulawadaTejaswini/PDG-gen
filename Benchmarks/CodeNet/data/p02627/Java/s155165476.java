import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //文字
    String a = sc.next();
    //判定
    if(Character.isUpperCase(a.charAt(0))) {
      System.out.println("A");
    }
    else {
      System.out.println("a");
    }
  }
}