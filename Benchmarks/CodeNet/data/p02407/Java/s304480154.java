import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    int ans[] = new int[125];
    int i;
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(i = 0; i < num; i++){
      ans[i] = in.nextInt();
    }
    for(int k = i-1; k>=0; k--){
      if(k ==0) {
        System.out.print(ans[k]);
      } else {
        System.out.print(ans[k] + " ");
      }
    }
    System.out.println();
  }
}

