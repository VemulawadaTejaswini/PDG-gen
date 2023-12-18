import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if(a < b){
      if(b < c){
        System.out.println(a + " " + b + " " + " " + c);
      }
      else{
        System.out.println(a + " " + c + " " + " " + b);
      }
    }
    else{
      if(a < c){
        System.out.println(b + " " + a + " " + " " + c);
      }
      else{
        System.out.println(b + " " + c + " " + " " + a);
      }
    }
}
}