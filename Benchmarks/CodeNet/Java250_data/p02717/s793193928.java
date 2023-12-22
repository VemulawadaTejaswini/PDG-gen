import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();
    int change;

  change = x;
    x = y;
    y = change;

    change = x;
    x = z;
    z = change;

    System.out.println(x+" "+y+" "+z);
  }
}
