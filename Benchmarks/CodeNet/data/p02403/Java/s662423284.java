import java.util.*;

class Main{
  static int H,W,i,j;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      H = sc.nextInt();
      W = sc.nextInt();
      int i = 0;
      if (H == 0 && W == 0) {
        break;
        }
      while (i<H) {
        for (j=0; j<W; j++) {
          System.out.print("#");
        }
          System.out.println("");
          i++;
        }
          System.out.println("");
      }
  }
}


