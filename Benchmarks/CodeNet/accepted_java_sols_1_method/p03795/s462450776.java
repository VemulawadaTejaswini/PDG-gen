import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x < 14){
      System.out.println(x * 800);
    }else{
      int y = x / 15;
      y *= 200;
      x *= 800;
      System.out.println(x - y);
    }
  }
}