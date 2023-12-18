import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String[] s = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
    String a = input.next();
    
    int g = 0;
    for(int i=0;i<s.length;i++)
      if(a.equals(s[i]))
        g=i;
    if(g==6)
      System.out.println(7);
    else
      System.out.println(6-g);
    
  }
}