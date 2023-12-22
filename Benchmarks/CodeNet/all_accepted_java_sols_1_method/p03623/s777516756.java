import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int x = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(Math.abs(a - x) < Math.abs(b - x)){
        System.out.println("A");
      }else{
        System.out.println("B");
      }
    }
  }
}