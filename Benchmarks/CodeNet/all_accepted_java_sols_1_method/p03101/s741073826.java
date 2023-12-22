import java.util.Scanner;

public class Main{
  static int H,W,h,w,ans;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    h = sc.nextInt();
    w = sc.nextInt();
    ans = H*W-H*w-W*h+w*h;
    System.out.println(ans);
  }
}