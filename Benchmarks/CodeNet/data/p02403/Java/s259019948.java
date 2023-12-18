import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException {
    Scanner scan=new Scanner(System.in);
    int[] h=new int[300];
    int[] w=new int[300];
    int count=0;
    for(int i=0;i<h.length;i++){
      h[i]=Integer.parseInt(scan.next());
      w[i]=Integer.parseInt(scan.next());
      count++;
      if(h[i]==0 && w[i]==0){
        break;
      }
    }

    for(int k=0;k<count;k++){
      for(int i=0;i<h[k];i++){
        for(int j=0;j<w[k];j++){
          System.out.print("#");
        }
        System.out.printf("\n");
      }
      System.out.printf("\n");
    }
  }
}
