import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str;
    str = in.nextLine();
    char [] cin = str.toCharArray();

    for(int i=0;i<cin.length;++i){
      if (Character.isUpperCase(cin[i])){
        cin[i]=Character.toLowerCase(cin[i]);
      }else{
        cin[i]=Character.toUpperCase(cin[i]);
      }
    }
    System.out.println(cin);
  }
}

