import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();

    String t2=t.substring(0,s.length());
    // System.out.println(t2);

    if(t.length()==s.length()+1&&t2.equals(s)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
