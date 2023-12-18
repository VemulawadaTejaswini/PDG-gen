import java.util.*;

class Main{
  static int H,W,i,j,HH,HHH;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      H = sc.nextInt();
      W = sc.nextInt();
      int i = 1;
      HH = H;
      HHH = HH+1;
      if (H == 0 && W == 0) {
        break;
        }
      if (i==1) {
        for (j=0; j<W; j++) {
            System.out.print("#");
            }
            System.out.println("");
            i++;
      }
      while (i >1 && i<=H-1) {
        System.out.print("#");
        for (j=0; j<W-2; j++) {
          System.out.print(".");
        }
        System.out.print("#");
        System.out.println("");
        i++;
        }
        for (j=0; j<W; j++) {
          System.out.print("#");
          }
          System.out.println("");
          System.out.println("");
      }
  }
}

