import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    int count=0;
    for(int i=0;i<s1.length();++i) {
      if(s1.charAt(i)!=s2.charAt(i))
        count++;
      
    }
    System.out.println(count);
  }
}