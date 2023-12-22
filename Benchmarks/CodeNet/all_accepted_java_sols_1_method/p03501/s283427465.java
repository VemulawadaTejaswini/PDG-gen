import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int n = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(a * n > b){
        System.out.println(b);
      }else{
        System.out.println(a * n);
      }
    }
  }
}
      