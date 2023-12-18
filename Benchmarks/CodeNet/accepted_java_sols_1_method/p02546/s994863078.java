import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    StringBuilder s1=new StringBuilder(s);
    if(s1.charAt(s.length()-1)=='s')
      		s1.append("es");
    else
      	s1.append("s");
    System.out.println(s1);
  }
}
  