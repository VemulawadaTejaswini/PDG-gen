import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String ymd = sc.next();
    System.out.print("2018");
  for (int i = 4; i < ymd.length(); i++){
      System.out.print(ymd.charAt(i));
    }
  }
}
