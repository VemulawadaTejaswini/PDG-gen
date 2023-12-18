import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());

    while(T-- > 0){
      String s = sc.nextLine().replaceAll("Hoshino", "Hoshina");
      System.out.println(s);
    }
  }
}