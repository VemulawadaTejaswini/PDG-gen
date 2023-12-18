import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.replace("RRR","");
    if(s.length()==0){
      System.out.println(3);
      return;
    }
    s = s.replace("RR","");
    if(s.length()==1){
      System.out.println(2);
      return;
    }
    s = s.replace("R","");
    if(s.length()<3){
      System.out.println(1);
      return;
    }
    System.out.println(0);
  }
}
