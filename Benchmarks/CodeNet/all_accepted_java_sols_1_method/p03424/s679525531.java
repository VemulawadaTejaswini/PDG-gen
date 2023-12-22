import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String str = sc.nextLine().replace(" ", "").replace("Y", "");
    if(str.length() == n){
      System.out.println("Three");
    }else{
      System.out.println("Four");
    }
  }
}