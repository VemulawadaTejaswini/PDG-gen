import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    String x = sc.next();
    int b = Integer.parseInt(sc.next());
    if(x.equals("+")){
      System.out.println(a + b);
    }else{
      System.out.println(a - b);
    }
  }
}