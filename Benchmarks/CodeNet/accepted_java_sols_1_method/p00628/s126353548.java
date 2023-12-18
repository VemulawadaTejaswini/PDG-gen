import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      String s = sc.nextLine();
      if(s.equals("END OF INPUT")) break;

      String[] ss = s.split(" ",-1);
      for(String tmp : ss){
        System.out.print(tmp.length());
      }
      System.out.println();
    }
  }
}