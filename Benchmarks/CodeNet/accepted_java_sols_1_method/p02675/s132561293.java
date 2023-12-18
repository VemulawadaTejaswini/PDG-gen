import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    s = s.substring(len-1,len);
    if(s.equals("2") ||s.equals("4") ||s.equals("5") ||s.equals("7") ||s.equals("9")){
      System.out.println("hon");
    }else if(s.equals("3")){
      System.out.println("bon");
    }else{
      System.out.println("pon");
    }
  }
}
