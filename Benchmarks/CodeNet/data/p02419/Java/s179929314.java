import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try{
      String w=br.readLine();
      String line;
      int count=0;
      while((line=br.readLine())!=null){
        if(line.equals("END_OF_TEXT")) break;
        String lowerLine=line.toLowerCase();
        String[] text=lowerLine.split(" ");
        for(String t:text){
          if(t.endsWith(".")){
            t=t.substring(0,t.length()-1);
          }
          if(t.equals(w)) count++;
        }
      }
      System.out.println(count);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

