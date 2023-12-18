import java.util.*;

public class Main {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
 String s=sc.next();
 char c=s.charAt(0);
 
 if(c>='A' && c<='Z')
 c='A';
 
 else
 c='a';
 
 
      System.out.println(c);
    }
}