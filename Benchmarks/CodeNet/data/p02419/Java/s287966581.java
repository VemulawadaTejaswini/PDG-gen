import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    String w=scan.nextLine();
    int count=0;
    int now=1;

    while(true){
      String t=scan.nextLine();
      if(t.equals("END_OF_TEXT"))break;
      if(t.contains(w)){
        for(int i=0;i<t.length()-w.length();i++){
          if(t.startsWith(w,i)){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
