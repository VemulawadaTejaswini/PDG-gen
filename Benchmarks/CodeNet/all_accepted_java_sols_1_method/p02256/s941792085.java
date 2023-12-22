import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();

    if(x < y){
      int swap = x;
      x = y;
      y = swap;
    }

    while(y > 0){
      int z = x % y;
      if(z == 0){
        break;
      }
      x = y;
      y = z;
    }

    System.out.println(y);
  }


}
