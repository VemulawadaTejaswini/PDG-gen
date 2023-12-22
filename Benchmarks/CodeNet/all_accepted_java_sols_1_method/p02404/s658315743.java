import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws java.lang.Exception {
    Scanner scan=new Scanner(System.in);

    while(true){
      int h=Integer.parseInt(scan.next());
      int w=Integer.parseInt(scan.next());
      if(h==0 && w==0)break;

      for(int i=0;i<w;i++){
        System.out.print("#");
      }
      System.out.println();

      for(int i=0;i<h-2;i++){
        for(int j=0;j<w;j++){
          if(j==0 || j==w-1){
            System.out.print("#");
            if(j==w-1)System.out.println();
          }else{
            System.out.print(".");
          }
        }
      }

      for(int i=0;i<w;i++){
        System.out.print("#");
      }
      System.out.println();
      System.out.println();
    }
  }
}
