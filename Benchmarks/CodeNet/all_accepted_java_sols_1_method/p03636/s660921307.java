import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    sc.close();
    
    String start=s.substring(0,1);
    String end=s.substring(s.length()-1,s.length());
    int len=s.length()-2;
    System.out.println(start+len+end);
  }
}