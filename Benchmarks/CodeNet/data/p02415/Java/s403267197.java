import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.Math;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    StringBuilder str=new StringBuilder(scan.nextLine());

    char[] output=new char[str.length()];
    str.getChars(0,str.length(),output,0);

    for(int i=0;i<output.length;i++){
      if(!Character.isUpperCase( output[i] ) ){
        output[i]=Character.toUpperCase(output[i]);
      }else if(!Character.isLowerCase(output[i])){
        output[i]=Character.toLowerCase(output[i]);
      }
    }

    //outputを文字列にする
    String ans=new String(output);
    System.out.println(ans);
  }
}
