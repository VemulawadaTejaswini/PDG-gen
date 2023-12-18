import java.util.*;

class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String s1=sc.next();
     s1=s1.substring(0,s1.length()-1);
//System.out.println("SubsString is::"+s1);
    if(s1.equals(s))
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}  