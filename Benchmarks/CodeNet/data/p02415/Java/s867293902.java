import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char c[]=s.toCharArray();
    for(int i=0;i<s.length();i++){
      if(Character.isUpperCase(c[i])){
        c[i]=Character.toLowerCase(c[i]);
      }else if(Character.isLowerCase(c[i])){
        c[i]=Character.toUpperCase(c[i]);
      }
    }
    StringBuffer sb=new StringBuffer(new String(c));
    System.out.println(sb.toString());
  }
}

