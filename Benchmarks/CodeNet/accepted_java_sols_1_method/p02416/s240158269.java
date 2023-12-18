import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str;
    int sum = 0;
    boolean flag = true;
    while(true){
      str = in.nextLine();
      if(str.equals("0")) break;
      char [] cin = str.toCharArray();
      for(int i = 0; i < cin.length; i++){
          sum += Character.getNumericValue(cin[i]);
      }
      System.out.println(sum);
      sum = 0;
    }
  }
}

