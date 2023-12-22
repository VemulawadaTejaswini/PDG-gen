import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws java.lang.NumberFormatException{
    Scanner scan=new Scanner(System.in);
    StringBuilder input=new StringBuilder();
    do{
      input.append(scan.nextLine());
    }while(scan.hasNext());

    for(char i='a';i<='z';i++){
      int count=0;
      for(int j=0;j<input.length();j++){
        if(input.toString().charAt(j)==i || Character.toUpperCase(input.toString().charAt(j))==Character.toUpperCase(i)){
          count++;
        }
      }
      System.out.println(i+" : "+count);
    }
  }
}
