import java.util.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    String ans = num.replace("1",".").replace("9","#")
    .replace(".","9").replace("#","1");
    System.out.println(ans);
  }
}