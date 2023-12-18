import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());

    if(n==1){
      System.out.println("Hello World");
    }else if(n==2){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      System.out.println(a+b);
    }
  } 
}