import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    for(int i=0;i<s.length();i+=2){
      if(s.charAt(i)=='L'){
            System.out.println("No");
            return;
      }
    }
        for(int i=1;i<s.length();i+=2){
      if(s.charAt(i)=='R'){
            System.out.println("No");
            return;
      }
    }
    System.out.println("Yes");
  }
}