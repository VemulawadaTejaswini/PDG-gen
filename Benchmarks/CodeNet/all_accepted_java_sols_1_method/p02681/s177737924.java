import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    t=t.substring(0,t.length()-1);
    if(s.equals(t))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
