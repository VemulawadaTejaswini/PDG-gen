import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println((s.length()==2)?s:s.substring(2,3)+s.substring(1,2)+s.substring(0,1));
  }
}