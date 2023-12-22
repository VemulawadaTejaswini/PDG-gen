import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String t=sc.next();
    for(int i=0;i<t.length();i++){
      System.out.print(t.charAt(i)=='P'?'P':'D');
    }
    System.out.println();
  }
}