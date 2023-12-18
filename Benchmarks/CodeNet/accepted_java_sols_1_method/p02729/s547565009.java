import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    int c = a*(a-1)/2;
    int d = b*(b-1)/2;

    System.out.println(c+d);
  }
}
