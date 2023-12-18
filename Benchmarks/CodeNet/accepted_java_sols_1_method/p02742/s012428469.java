import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    long h, w;
    long ans = 0;
    Scanner scan = new Scanner(System.in);
    
    h = scan.nextInt();
    w = scan.nextInt();
    
    if(h == 1 || w == 1) {
      System.out.println(1);
    } else {
      ans = (long)((w*h + 1)/2);
      System.out.println(ans);
    }
  }
}
