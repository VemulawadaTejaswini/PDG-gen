import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;

    while(tmp == true){
      int x = sc.nextInt();
      int y = sc.nextInt();

      if(x == 0 && y == 0){
        tmp = false;
        break;
      }

      System.out.println(Math.min(x, y) + " " + Math.max(x, y));
    }
  }
}

