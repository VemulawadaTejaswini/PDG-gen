import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    long b = a*a*a;

    System.out.println((double) b/27);
  }
}
