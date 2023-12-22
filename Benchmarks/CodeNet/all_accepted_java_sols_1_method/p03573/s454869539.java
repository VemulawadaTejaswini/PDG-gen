import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    if(a == b){
      System.out.println(c);
    }
    if(b == c){
      System.out.println(a);
    }
    if(a == c){
      System.out.println(b);
    }
  }
}