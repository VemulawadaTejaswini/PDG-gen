import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();

    x = x - a;
    while(0 <= x){
      x = x - b;
    }

    x += b;
    System.out.println(x);
  }
}
