import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n =0;
    char a,b;
    String S = scan.nextLine();
    String T = scan.nextLine();
    for(int i = 0; i<3;i++){
        a = S.charAt(i);
        b = T.charAt(i);
      if(a==b){
        n++;}
    }
    System.out.println(n);
  }
}