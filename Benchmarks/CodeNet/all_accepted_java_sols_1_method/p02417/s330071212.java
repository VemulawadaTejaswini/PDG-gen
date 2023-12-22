import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str;
    int num[] = new int[26];
    while(in.hasNextLine()){
      str = in.nextLine();
      char [] cin = str.toCharArray();
      for(int i=0;i<cin.length;++i){
        cin[i]=Character.toLowerCase(cin[i]);
        for(int j = 0; j < 27; j++){
          if(cin[i] == j+97){
            num[j]++;
          }
        }
      }
    }
    for(int k = 0; k < 26; k++){
      char c = (char)(k + 97);
      System.out.println(c + " " + ":" + " " +num[k]);
    }
  }
}

