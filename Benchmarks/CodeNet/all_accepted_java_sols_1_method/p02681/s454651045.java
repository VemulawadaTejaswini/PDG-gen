import java.util.*;
class Main{
  public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      String a=s.next();
      String b=s.next();
      if(a.equals(b.substring(0,a.length())))
        System.out.println("Yes");
    else
        System.out.println("No");
  }
}