import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    String input=scan.next();
    int count=0;
    while(true){
      String str=scan.next();
      if(str.equals("END_OF_TEXT"))break;
      if(input.equalsIgnoreCase(str)){
        count++;
      }
    }
    System.out.println(count);
  }
}

