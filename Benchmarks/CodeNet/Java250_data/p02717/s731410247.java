import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int t;
    t = x;
    x = y;
    y = t;
    t = x;
    x = z;
    z = t;
    System.out.print(x);
    System.out.print(" "+y);
    System.out.println(" "+z);
  }
}