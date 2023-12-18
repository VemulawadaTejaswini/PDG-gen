import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);

    while(true){
      int h=Integer.parseInt(scan.next());
      int w=Integer.parseInt(scan.next());
      if(h==0 && w==0)break;
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){

          if(i%2==0){
            if(j%2==0){
              System.out.print("#");
            }else{
              System.out.print(".");
            }
          }else{
            if(j%2==0){
              System.out.print(".");
            }else{
              System.out.print("#");
            }
          }

        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
