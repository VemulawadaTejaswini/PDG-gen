import java.util.*;

class Main {
    static int W,H,x,y,r;
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      W = sc.nextInt();    
      H = sc.nextInt();    
      x = sc.nextInt();
      y = sc.nextInt();    
      r = sc.nextInt();
      //左にはみ出す場合
      if (x<r) {
        System.out.println("No");
        //右にはみ出す場合
        } else if (W<x+r) {
          System.out.println("No");
        //下にはみ出す場合
        } else if (y-r<0) {
          System.out.println("No");
        //上にはみ出す場合
        } else if (y+r>H) {
          System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }
}
