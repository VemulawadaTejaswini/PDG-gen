import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int w = scan.nextInt();
    int h = scan.nextInt();
    int n = scan.nextInt();
    int xmax = w;
    int xmin = 0;
    int ymax = h;
    int ymin = 0;

    for(int i = 0; i < n; i++){
      int x = scan.nextInt();
      int y = scan.nextInt();
      int a = scan.nextInt();
      if(a == 1){
        xmin = Math.max(xmin, x);
      }else if(a == 2){
        xmax = Math.min(xmax, x);
      }else if(a == 3){
        ymin = Math.max(ymin, y);
      }else{
        ymax = Math.min(ymax, y);
      }
    }

    if(xmax-xmin>0 && ymax-ymin>0){
      System.out.println((xmax-xmin)*(ymax-ymin));
    }else{
      System.out.println(0);
    }

  }
}
