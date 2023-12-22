import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if (s.charAt(s.length()-1)=='3') {
      System.out.println("bon");
    }else if(s.charAt(s.length()-1)=='0'||s.charAt(s.length()-1)=='1'||s.charAt(s.length()-1)=='6'||s.charAt(s.length()-1)=='8'){
      System.out.println("pon");
    }else{
      System.out.println("hon");
    }
  }
}
