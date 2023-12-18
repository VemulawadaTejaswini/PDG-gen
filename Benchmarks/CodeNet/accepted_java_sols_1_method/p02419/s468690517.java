import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in  = new Scanner(System.in);
    String word = in.nextLine();
    String str,txt = "";
    int num     = 0;

    word = word.toLowerCase();

    while(true){
      str = in.nextLine();
      if( str.equals("END_OF_TEXT") ) break;
      str = str.toLowerCase();
      txt = str + " " + txt;
    }

    String[] tokens = txt.split(" ");
    for (String token : tokens) {
      if (token.equals(word)) {
          num++;
      }
    }
    System.out.println(num);
  }
}

