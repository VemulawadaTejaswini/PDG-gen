import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int H, W, h, w;
    Scanner in = new Scanner(System.in);
    H = in.nextInt();
    W = in.nextInt();
    h = in.nextInt();
    w = in.nextInt();
    System.out.printf("%d\n", (H-h)*(W-w));
  }
}
