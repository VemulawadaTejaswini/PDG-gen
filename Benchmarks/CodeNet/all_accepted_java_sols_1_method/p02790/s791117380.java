import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    if (a <= b){
      for(int i = 0; i < b; i++){
        System.out.print(a);
      }
    }
    else {
      for (int j = 0; j < a; j++){
        System.out.print(b);
      }
    }
  }
}
