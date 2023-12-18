import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws java.lang.NumberFormatException{
    Scanner scan=new Scanner(System.in);
    String input=scan.nextLine();

    for(char i='a';i<='z';i++){
      int count=0;
      for(int j=0;j<input.length();j++){
        if(input.charAt(j)==i || Character.toUpperCase(input.charAt(j))==Character.toUpperCase(i)){
          count++;
        }
      }
      if(i<'z'){
        System.out.println(i+" : "+count);
      }else{
        System.out.print(i+" : "+count);
      }
    }
  }
}
