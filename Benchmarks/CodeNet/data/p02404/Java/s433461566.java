import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
    while(true){
      int H = scan.nextInt();
      int W = scan.nextInt();

      if(A == 0 && B == 0){
        break;
      }

      for(int h=0;h<H;h ++){
        for(int w=0;w<W;w ++){
          if(a == 0 || a == H - 1 || b == 0 || b == B - 1){
              System.out.print("#");
          } else {
            System.out.print(".");
          }
        System.out.println();
        }
      System.out.println();
      }
}
}
}