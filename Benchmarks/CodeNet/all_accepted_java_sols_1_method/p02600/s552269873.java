import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = (int) n%200;
    n -= k;
    int g = (int) n/200;
    System.out.println(10-g);
  }
}
