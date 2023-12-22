import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws java.lang.NumberFormatException{
    Scanner scan=new Scanner(System.in);

    while(true){
      String num=scan.next();
      if(num.equals("0"))break;

      long sum=0;

      for(int i=0;i<num.length();i++){
        sum+=Character.getNumericValue(num.charAt(i));
      }
      System.out.println(sum);
    }
  }
}
