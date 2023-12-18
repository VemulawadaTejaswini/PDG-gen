import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();
    int Total=0;
    
    Total=H*W-h*W;
    System.out.println(Total-(H-h)*w);
  }
}